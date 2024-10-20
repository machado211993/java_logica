import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) throws Exception {
        /*
         * 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
         * programa
         * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
         * investigar
         * la función equals() en Java.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese una frase");

        String frase = leer.next();
        if (frase.equals("eureka")) {
            System.out.println("Correcto eureka");

        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("por favor ingrese otra frase para calcular son longitud");
        String frase2 = leer.next();

        if (frase2.length() == 4) {
            System.out.println("correcto, la frase tiene 4 letras");
        } else {
            System.out.println("incorrecto");
        }

        System.out.println("por favor ingrese una tercera frase para verificar si no esta vacio");
        String frase3 = leer.next();
        if (frase3.isEmpty()) {
            System.out.println("error la frase esta vacia");

        } else {
            System.out.println("correcto, la frase NO esta vacia");

        }

        System.out.println("por favor ingresar una cuarta frase");
        String frase4 = leer.next();
        if (frase4.contains("a")) {
            System.out.println("la frase contiene una letra (a)");

        } else {
            System.out.println("la frase no contiene una letra (a)");
        }

    }
}
