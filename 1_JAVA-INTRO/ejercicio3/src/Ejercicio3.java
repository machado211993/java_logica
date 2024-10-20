import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        /*
         * 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
         * después toda
         * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
         * Java.
         */

        System.out.println("por favor ingrese una frase");

        Scanner leer = new Scanner(System.in);

        String frasemay = leer.next().toUpperCase();
        String frasemin = leer.next().toLowerCase();

        System.out.println("la frase en minuscula " + frasemin);
        System.out.println("la frase en mayuscula " + frasemay);

    }
}
