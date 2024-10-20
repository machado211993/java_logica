import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * EJERCICIO 13
         * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
         * de equipo y
         * define su tipo de dato de tal manera que te permita alojar sus nombres más
         * adelante.
         */

        /*
         * EJERCICIO 14
         * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
         * compañeros de equipo
         */

        String equipo[] = new String[6];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("ingrese los nombres de sus compañeros");
            String compañero = leer.next();
            equipo[i] = compañero;
        }
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("[" + equipo[i] + "]");
        }
        System.out.println("");
    }
}
