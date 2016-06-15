package examenfinalparte2;

import javax.swing.JOptionPane;

/**
 *
 * @author gallegomanuel88
 */


public class Metodos {
    /**
     * Adquiere un valor para imprimir. Tendra el valor true si el ndig es primo, false si el nuemro no es primo.
     */
    public static boolean imprimir = false;
    /**
     * Adquiere un valor que sera el número de digitos que tendran los numeros primos que queremos mostrar.
     */
    static int numeroDigitos = 0;
    static int ndig = 0;
    /**
     * Muestra un mensaje por pantalla preguntando el numero de digitos que queremos mostrar. 
     * El valor que introduzcamos se le aplicara a "numeroDigitos".
     */
    public void condicion (){
        if (numeroDigitos <= 0) {
            numeroDigitos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        }
    }
    /**
     * Calcula e imprime por consola numeros primos. 
     * Se mostraran los numeros primos en funcion de los digitos que hayamos indicado en el metodo "condicion".
     */
    public void operacion () {
        
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;
            
            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            ndig = contador;

            if (ndig == numeroDigitos) {
                if (i < 4) {
                    imprimir = true;
                } else if (i % 2 == 0) {
                    imprimir = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (i - 1) / 2;
                    if (k % 2 == 0) {
                        k--;
                    }
                    //Calcula si el 
                    while (i1 <= k) {
                        if (i % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = k + 1;
                        }
                    }

                    if (contador1 == 1) {
                        imprimir = true;
                    }
                }

                if (imprimir == true) {
                    System.out.println(i);
                }
            }
        }
    }
    
}
