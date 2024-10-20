public class vectorymatriz {
    public static void main(String[] args) throws Exception {
        int[] vector = new int[6];

        /* asigno valores mediante el for */
        for (int i = 0; i <= 5; i++) {
            vector[i] = i + 1;
        }

        /* muestro el vector */
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");

        }
        System.out.println("");

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i + 1;

            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(""); 
        }

    }

}