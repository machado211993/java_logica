import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {
        /*
         * 5. Escribir un programa que lea un número entero por teclado y muestre por
         * pantalla el
         * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la
         * función Math.sqrt().
         */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero por teclado");
        int numero = leer.nextInt();
        System.out.println("el doble del numero ingresado es " +numero*2);
        System.out.println("el triple del numero ingresado es " +numero*3);
        
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("la raiz cuadrada del numero ingresado es " +raizCuadrada);

        

    }
}
