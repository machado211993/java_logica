
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) throws Exception {
        /*
         * Bucles y sentencias de salto break y continue
         * 10. Escriba un programa en el cual se ingrese un valor límite positivo, y a
         * continuación solicite
         * números al usuario hasta que la suma de los números introducidos supere el
         * límite inicial.
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        while (suma < limite) {
            System.out.println("por favor ingresar un valor hasta alcanzar el limite");
            int valor = leer.nextInt();
            suma = suma + valor;
            System.out.println("la sumatoria va por  " + suma);
        }
        if (suma >= limite) {
            System.out.println("fin, la sumatoria supero el limite inicial");

        }
    }
}
