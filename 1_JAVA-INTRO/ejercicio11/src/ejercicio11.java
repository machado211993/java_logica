import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) throws Exception {
        /*
         * 11. Realizar un programa que pida dos números enteros positivos por teclado y
         * muestre por
         * pantalla el siguiente menú:
         * MENU
         * 1. Sumar
         * 2. Restar
         * 3. Multiplicar
         * 4. Dividir
         * 5. Salir
         * Elija opción:
         * El usuario deberá elegir una opción y el programa deberá mostrar el resultado
         * por pantalla
         * y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
         * opción 5.
         * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
         * del programa
         * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
         * seguro que
         * desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se
         * sale del
         * programa, caso contrario se vuelve a mostrar el menú.
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("por favor ingrese dos numeros positivos por teclado ");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();

        System.out.println("ingrese lo que desee realizar,  1. Sumar\r\n" + //
                "         * 2. Restar\r\n" + //
                "         * 3. Multiplicar\r\n" + //
                "         * 4. Dividir\r\n" + //
                "         * 5. Salir ");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("la suma de los dos numeros ingresados es " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("la resta de los dos numeros ingresados es " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("la multiplicacion de los dos numeros ingresados es " + (numero1 * numero2));
                break;

            case 4:
                System.out.println("la division de los dos numeros ingresados es " + (numero1 / numero2));
                break;

            case 5:
                System.out.println("usted salio del programa");
                break;

            default:
                System.out.println("opcion invalida");

        }
    }
}
