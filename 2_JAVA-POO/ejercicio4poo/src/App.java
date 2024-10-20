import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
         * privado
         * base y un atributo privado altura. La clase incluirá un método para crear el
         * rectángulo con///
         * los datos del Rectángulo dados por el usuario. También incluirá un método
         * para calcular la
         * superficie del rectángulo y un método para calcular el perímetro del
         * rectángulo. Por último,
         * tendremos un método que dibujará el rectángulo mediante asteriscos usando la
         * base y la
         * altura. Se deberán además definir los métodos getters, setters y
         * constructores
         * correspondientes.
         * Superficie = base * altura / Perímetro = (base + altura) * 2.
         */
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.crear();
        rectangulo.superficie();
        rectangulo.perimetro();

    }

    public static class Rectangulo {
        Scanner leer = new Scanner(System.in);
        int b = leer.nextInt();
        int a = leer.nextInt();

        int[][] matriz = new int[b][a];

        public void crear() {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        public void superficie() {
            // Superficie = base * altura
            double superficie = b * a;
            System.out.println("la superficie del cuadrado es " + superficie);
        }

        public void perimetro() {
            // Perímetro = (base + altura) * 2.
            double perimetro = (b * a) * 2;
            System.out.println("el perimetro del cuadrado es " + perimetro);
        }
    }

}
