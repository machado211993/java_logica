import java.util.Scanner;

public class manosalaobra9 {
    public static void main(String[] args) throws Exception {
        /*
         * EJERCICIO 9
         * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
         * debe salir del
         * bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá
         * calcular y mostrar el
         * resultado de la suma de los números leídos, pero si el número es negativo no
         * debe sumarse.
         * Nota: recordar el uso de la sentencia break.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("por favor ingrese un numero");
        int numero = leer.nextInt();
        int sumador = 0;
        while (numero != 0) {

            if (numero > 0) {
                sumador = sumador + numero;

            } else {
                System.out.println("el numero es negativo y no se va a sumar");
            }
            System.out.println("por favor ingrese otro numero");
            numero = leer.nextInt();
        }
        System.out.println("se capturo el numero cero FIN");
        System.out.println("el resultado de la suma de los numero leidos es  " + sumador);
        /*espectacular */
    }
}
