import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) throws Exception {
        /*
         * 12. Realizar un programa que simule el funcionamiento de un dispositivo
         * RS232, este tipo de
         * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con
         * un formato
         * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
         * carácter tiene que ser
         * X y el último tiene que ser una O.
         */

        Scanner scanner = new Scanner(System.in);
        String input;
        int correctas = 0;
        int incorrectas = 0;

        // Iniciar el bucle
        do {
            // Pedir la entrada al usuario
            System.out.println("Ingresa una secuencia (escribe '&&&&&' para terminar): ");
            input = scanner.nextLine();

            // Verificar si es la secuencia especial "&&&&&" que finaliza el programa
            if (input.equals("&&&&&")) {
                break; // Finaliza el bucle
            }

            // Validar si la cadena cumple con las reglas
            if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                correctas++; // Contar como lectura correcta
            } else {
                incorrectas++; // Contar como lectura incorrecta
            }

        } while (true); // El bucle se ejecuta hasta que se reciba "&&&&&"

        // Imprimir el informe de resultados
        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}
