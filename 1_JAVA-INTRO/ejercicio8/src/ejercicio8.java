import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) throws Exception {
        /*
         * 8. Realizar un programa que solo permita introducir solo frases o palabras de
         * 8 de largo. Si el
         * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un
         * mensaje por
         * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
         * “INCORRECTO”.
         * Nota: investigar la función Lenght() en Java.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("por favor introducir una frase de 8 caracteres de largo");

        String frase = scanner.next();

        if (frase.length() == 8) {

            System.out.println("CORRECTO, la frase tiene 8 caracteres");
        } else {
            System.out.println("INCORRECTO, la frase no tiene 8 caracteres");

        }

    }
}
