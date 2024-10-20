import java.util.Scanner;

public class manosalaobra6 {
    public static void main(String[] args) throws Exception {
        /*
         * EJERCICIO 6
         * Implementar un programa que le pida dos números enteros a usuario y determine
         * si ambos o
         * alguno de ellos es mayor a 25.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese dos numeros enteros");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();

        if (numero1 > 25 && numero2 > 25) {
            System.out.println("ambos numero son mayores a 25");
        } else if (numero1 > 25 || numero2 > 25) {
            System.out.println("almenos uno de los numero es mayor a 25");
        } else {
            System.out.println("ninguna es mayor a 25");
        }

    }
}