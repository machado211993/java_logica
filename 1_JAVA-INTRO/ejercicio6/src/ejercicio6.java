import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) throws Exception {
        /*
         * Condicionales en Java
         * 6. Crear un programa que dado un numero determine si es par o impar.
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para determinar si es par o impar");
        Double numero = leer.nextDouble();

        if (numero % 2 == 0){
            System.out.println("el numero " +numero +  " es par");
        }else{
            System.out.println("el numero 1212" +numero +  " es impar");
        }

    }
}
