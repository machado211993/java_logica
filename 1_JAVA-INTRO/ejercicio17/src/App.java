import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 17. Recorrer un vector de N enteros contabilizando cuántos números son de 1
         * dígito, cuántos
         * de 2 dígitos, etcétera (hasta 5 dígitos).
         */

        System.out.println("por favor ingrese el tamaño del vector");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int vector[] = new int[n];
        Random random = new Random();
        int undig = 0;
        int dosdig = 0;
        int tresdig = 0;
        int cuatrodig = 0;
        int cincodig = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(n);
            int longitud = String.valueOf(vector[i]).length();
            if (longitud == 1) {
                undig = undig + 1;
            }
            if (longitud == 2) {
                dosdig = dosdig + 1;
            }
            if (longitud == 3) {
                tresdig = tresdig + 1;
            }
            if (longitud == 4) {
                cuatrodig = cuatrodig + 1;
            }
            if (longitud == 5) {
                cincodig = cincodig + 1;
            }

        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        System.out.println("");

        System.out.println("de un digitos " + undig);
        System.out.println("de dos digitos " + dosdig);
        System.out.println("de tres digitos " + tresdig);
        System.out.println("de cuatro digitos " + cuatrodig);
        System.out.println("de cinco digitos " + cincodig);

        /* espectacular */
    }
}
