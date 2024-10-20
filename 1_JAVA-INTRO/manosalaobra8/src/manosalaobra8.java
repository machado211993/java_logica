import java.util.Scanner;

public class manosalaobra8 {
    public static void main(String[] args) throws Exception {
        /*
         * EJERCICIO 8
         * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
         * 0 y 10 la nota se
         * pedirá de nuevo hasta que la nota sea correcta.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese una nota para verificar si esta entre 0 y 10");

        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("ingrese una nota valida");
            nota = leer.nextInt();

        }
        System.out.println("fin, la nota es correcta  es  " + nota);
        /* ejemplo con do while */
        int nota2 = 0;
        do {
            System.out.println("por favor ingrese una nota valida entre 0 y 10");
            nota2 = leer.nextInt();
        } while (nota2 < 0 || nota2 > 10);
        System.out.println("fin del do while, la nota es valida5");

    }
}
