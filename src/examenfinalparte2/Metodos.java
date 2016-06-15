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
    /**
     * Adquiere como valor el numero de digitos que se mostrara.
     */
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
        
        for (int numeroAcomparar = 1; numeroAcomparar <= 99999; numeroAcomparar++) {
            int aux = numeroAcomparar;
            
            ndig = divisionEntera(numeroAcomparar);
            System.out.println(ndig+" ndig");
            
            //Comprueba si el digito y su numero de cifras es igual.
            if (ndig == numeroDigitos) {
                
                //Comprueba si el numero es menor que 4. Si se cumple es primo.
                if (numeroAcomparar < 4) {
                    imprimir = true;
                } 
                
                //Comprueba si el numero es divisible entre 2. Si se cumple no es primo.
                else if (numeroAcomparar % 2 == 0) {
                    imprimir = false;
                } 
                //
                else {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (numeroAcomparar - 1) / 2;
                    if (k % 2 == 0) {
                        k--;
                    }
                    //Calcula si el 
                    while (i1 <= k) {
                        if (numeroAcomparar % i1 == 0) {
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
                    System.out.println(numeroAcomparar);
                }
            }
        }
    }
    /**
     * Comprueba el numero de divisiones enteras que tiene "numAComparar". 
     * @param numAcomparar numero que vamos a comprobar su numero de divisiones enteras.
     * @return numero de divisiones enteras.
     */
    private static int divisionEntera(int numAcomparar) {
        int aux = numAcomparar;
        int contador = 0;
        while (aux != 0) {
            aux = aux / 10;
            contador++;
        }
        return contador;
    }
}
