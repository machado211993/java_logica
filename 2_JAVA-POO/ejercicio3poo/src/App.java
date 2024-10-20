import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("el resultado de la suma es " + operacion.sumar());
        System.out.println("el resultado de la resta es " + operacion.restar());
        System.out.println("el resultado de la multiplicacion es " + operacion.multiplicación());
        System.out.println("el resultado de la division es " + operacion.división());

    }
    /*
     * 3. Crear una clase llamada Operacion que tenga como atributos privados
     * numero1 y
     * numero2. A continuación, se deben crear los siguientes métodos:
     * a) Método constructor con todos los atributos pasados por parámetro.
     * b) Metodo constructor sin los atributos pasados por parámetro.
     * c) Métodos get y set.
     * d) Método para crearOperacion(): que le pide al usuario los dos números y los
     * guarda en
     * los atributos del objeto.
     * e) Método sumar(): calcular la suma de los números y devolver el resultado al
     * main.
     * f)
     * Método restar(): calcular la resta de los números y devolver el resultado al
     * main
     * g) Método multiplicar(): primero valida que no se haga una multiplicación por
     * cero, si
     * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario
     * el error. Si
     * no, se hace la multiplicación y se devuelve el resultado al main
     * h) Método dividir(): primero valida que no se haga una división por cero, si
     * fuera a pasar
     * una división por cero, el método devuelve 0 y se le informa al usuario el
     * error se le
     * informa al usuario. Si no, se hace la división y se devuelve el resultado al
     * main.
     */

    public static class Operacion {
        int numero1;
        int numero2;

        public Operacion() {
        }

        public Operacion(int numero1, int numero2) {
            this.numero1 = numero1;
            this.numero2 = numero2;
        }

        /*
         * d) Método para crearOperacion(): que le pide al usuario los dos números y los
         * guarda en
         * los atributos del objeto.
         */
        Scanner leer = new Scanner(System.in);

        public void crearOperacion() {
            System.out.println("por favor ingrese un primer numero");
            numero1 = leer.nextInt();
            System.out.println("por favor ingrese un segundo numero");
            numero2 = leer.nextInt();

        }
        /*
         * e) Método sumar(): calcular la suma de los números y devolver el resultado al
         * main.
         */

        public int sumar() {
            int sumar = numero1 + numero2;
            return sumar;
        }

        public int restar() {
            int restar = numero1 - numero2;
            return restar;
        }

        /*
         * g) Método multiplicar(): primero valida que no se haga una multiplicación por
         * cero, si
         * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario
         * el error. Si
         * no, se hace la multiplicación y se devuelve el resultado al main
         */

        public double multiplicación() {
            double multiplicacion = 0;

            if (numero2 != 0) {
                multiplicacion = numero1 * numero2;
                return multiplicacion;
            } else {
                System.out.println("el numero no se puede multiplicar por cero");
                return 0;

            }

        }

        /*
         * h) Método dividir(): primero valida que no se haga una división por cero, si
         * fuera a pasar
         * una división por cero, el método devuelve 0 y se le informa al usuario el
         * error se le
         * informa al usuario. Si no, se hace la división y se devuelve el resultado al
         * main.
         */

        public double división() {
            double division = 0;

            if (numero2 != 0) {
                division = numero1 / numero2;
                return division;
            } else {
                System.out.println("el numero no se puede diviri por cero");
                return 0;
            }

        }
    }

}