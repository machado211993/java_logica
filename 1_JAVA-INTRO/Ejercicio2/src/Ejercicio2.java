import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        /*
         * 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo
         * muestre por
         * pantalla.
         */

        System.out.println("por favor ingresar su nombre");

        Scanner leer = new Scanner(System.in);

        String nombre = leer.next();

        System.out.println("el nombre ingresado es  "  +nombre);



    }
}
