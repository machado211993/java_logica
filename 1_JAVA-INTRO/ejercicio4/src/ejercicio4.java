import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) throws Exception {

        /*
         * 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
         * grados
         * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */

        System.out.println("por favor ingrese los grados celsius");
        Scanner leer = new Scanner(System.in);

        int celsius = leer.nextInt();

        int conversion = 32 + (9 * celsius / 5);

        System.out.println("los grados celsius convertido a Fahrenheit son " + conversion);

    }
}
