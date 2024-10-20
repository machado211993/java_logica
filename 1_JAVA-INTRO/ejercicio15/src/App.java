public class App {
    public static void main(String[] args) throws Exception {

        /*
         * 15. Realizar un algoritmo que rellene un vector con los 100 primeros números
         * enteros y los
         * muestre por pantalla en orden descendente.
         */
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        System.out.println("vector mostrado de manera ascendente");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");

        System.out.println("vector mostrado de manera descendente");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");

    }
}
