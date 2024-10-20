import java.util.Scanner;

public class errores {
    public static void main(String[] args) throws Exception {
        /*
         * EJERCICIO 1
         * Crear un proyecto de Java y definir al menos 6 variables en tu IDE de
         * distintos tipos de datos.
         */

        String var1;
        long var2;
        boolean var3;
        float var4;
        int var5;
        double var6;

        var1 = "hola";
        var3 = true;
        var4 = 123123;
        var5 = 1;
        var6 = 1.2;

        /*
         * EJERCICIO 5
         * Define una variable de tipo boolean, double y char. Guarda información en
         * ellas a través del
         * Scanner.
         */
        /*
         * System.out.println("por favor ingrese un valor boolean, double, char");
         * Scanner leer = new Scanner(System.in);
         * boolean b1 = leer.nextBoolean();
         * double d1 = leer.nextDouble();
         * char c1 = leer.nextLine().charAt(0);
         * 
         * System.out.println(b1);
         * System.out.println(d1);
         * System.out.println(c1);
         * 
         * System.out.println("Ingresa tu nombre");
         * 
         * String nombre = leer.next();
         * System.out.println("Ingresa tu edad");
         * int edad = leer.nextInt();
         */

        // && //AND y

        // || //OR o

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
        int cont = 0;
        int suma = 0;
        while (cont != 20) {
            System.out.println("ingrese una secuencia de 20 numero, cero para salir2 ");
            int numero = leer.nextInt();
            if (numero == 0) {
                break;

            } else if (numero > 0) {
                suma = suma + numero;
                cont++;
            } 
          
            System.out.println("se leyo esta cantidad de numero " + cont);

        }
        System.out.println("la cantidad de numeros ingresados fue " + cont);
        System.out.println("la sumatoria de los numeros ingresados es " + suma);
    }
}
