import java.util.Scanner;

public class practicandoFunciones {
    public static void main(String[] args) throws Exception {

        int numero1 = 3;
        int numero2 = 4;

        System.out.println("la suma de numero1 y numero2 es  " + sumar(numero1, numero2));
        System.out.println("la resta de numero1 y numero2 es  " + restar(numero1, numero2));
        System.out.println("la multiplicacion de numero1 y numero2 es  " + multiplicar(numero1, numero2));
        System.out.println("la division de numero1 y numero2 es  " + dividir(numero1, numero2));
    }

    public static int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;

    }

    public static int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;

    }

    public static int multiplicar(int numero1, int numero2) {
        int resta = numero1 * numero2;
        return resta;

    }

    public static double dividir(int numero1, int numero2) {
        double division = numero1 / numero2;
        return division;

    }
}
