import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) throws Exception {
        /*
         * 9. Escriba un programa que pida una frase o palabra y valide si la primera
         * letra de esa frase
         * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
         * por pantalla que
         * diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
         * investigar
         * la función Substring y equals() de Java.
         */

         Scanner leer = new Scanner(System.in);
         System.out.println("por favor ingrese una palabra para verificar si la primera letra es una A");
         String palabra = leer.next();

         if (palabra.substring(0,1).equals("a")){
            System.out.println("correcto, la palabra comienza con letra A");
            
         } else {
            System.out.println("incorrecto, la palabra no comienza con A");
            
         }

    }
}
