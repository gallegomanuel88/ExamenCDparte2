package examenfinalparte2;

public class Principal {

    public static boolean p = false;

    public static void main(String arg[]) {
        int dig = 2;
        int ndig = 0;
        
        Metodos objMetodos = new Metodos ();
        objMetodos.condicion(dig);
        objMetodos.operacion(dig, ndig, p);
    }

}
