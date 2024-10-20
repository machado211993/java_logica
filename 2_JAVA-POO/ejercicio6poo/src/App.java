import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
         * capacidadMaxima
         * (la cantidad máxima de café que puede contener la cafetera) y cantidadActual
         * (la cantidad
         * actual de café que hay en la cafetera). Implemente, al menos, los siguientes
         * métodos:
         * • Constructor predeterminado o vacío
         * • Constructor con la capacidad máxima y la cantidad actual
         * • Métodos getters y setters.
         * • Método llenarCafetera(): hace que la cantidad actual sea igual a la
         * capacidad máxima.
         * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método
         * recibe el
         * tamaño de la taza y simula la acción de servir la taza con la capacidad
         * indicada. Si la
         * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que
         * quede. El
         * método le informará al usuario si se llenó o no la taza, y de no haberse
         * llenado en
         * cuanto quedó la taza.
         * • Método vaciarCafetera(): pone la cantidad de café actual en cero.
         * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el
         * método lo
         * recibe y se añade a la cafetera la cantidad de café indicada.
         */
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        cafetera.servirTaza(0);
        cafetera.vaciarCafetera();
        cafetera.agregarCafe();

    }

    public static class Cafetera {
        int capacidadMaxima = 1500;
        int cantidadActual;

        public int getCapacidadMaxima() {
            return capacidadMaxima;
        }

        public void setCapacidadMaxima(int capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
        }

        public int getCantidadActual() {
            return cantidadActual;
        }

        public void setCantidadActual(int cantidadActual) {
            this.cantidadActual = cantidadActual;
        }

        public Scanner getLeer() {
            return leer;
        }

        public void setLeer(Scanner leer) {
            this.leer = leer;
        }

        public Cafetera(int capacidadMaxima, int cantidadActual, Scanner leer) {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;
            this.leer = leer;
        }

        public Cafetera() {
        }

        /*
         * • Método llenarCafetera(): hace que la cantidad actual sea igual a la
         * capacidad máxima.
         */
        Scanner leer = new Scanner(System.in);

        public void llenarCafetera() {
            System.out.println("por favor ingrese 1500cc de cafe para llenar la cafetera");
            cantidadActual = leer.nextInt();
            if (cantidadActual == capacidadMaxima) {
                System.out.println("la cafetera esta llena se encuentra con " + cantidadActual + " cm3");
            } else {
                System.out.println("la cantidad ingresada no coincide con la capacidad maxima para llenar la cafetera");
            }

        }

        /*
         * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método
         * recibe el
         * tamaño de la taza y simula la acción de servir la taza con la capacidad
         * indicada. Si la
         * cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que
         * quede. El
         * método le informará al usuario si se llenó o no la taza, y de no haberse
         * llenado en
         * cuanto quedó la taza.
         */

        int tamañoTaza;

        public void servirTaza(int tamañoTaza) {
            System.out.println("por favor ingrese el tamaño de la taza ");
            tamañoTaza = leer.nextInt();
            if (cantidadActual >= tamañoTaza) {
                cantidadActual = cantidadActual - tamañoTaza;
                int taza = tamañoTaza;
                System.out.println("la taza se ha llenado completamente con " + taza);
                System.out.println("tamaño actual de la cafetera es  " + cantidadActual);

            } else {
                cantidadActual = cantidadActual - tamañoTaza;
                int taza = cantidadActual;
                System.out.println("la taza no se ha llenado, la taza quedo en  " + taza);
                System.out.println("tamaño actual de la cafetera es  " + cantidadActual);

            }
        }

        /** • Método vaciarCafetera(): pone la cantidad de café actual en cero. */
        public void vaciarCafetera() {
            cantidadActual = 0;
            System.out.println("se vacio la cafetera, la cantidad quedo en " + cantidadActual);
        }

        /*
         * * • Método agregarCafe(int): se le pide al usuario una cantidad de café, el
         * método lo
         * recibe y se añade a la cafetera la cantidad de café indicada.
         */

        public void agregarCafe() {
            System.out.println("por favor ingrese la cantidad de cafe que quiere agregar a la cafetera");
            int cafe = leer.nextInt();
            cantidadActual = cantidadActual + cafe;
            System.out.println(" la cantidad de cafe que posee la cafetera es " + cantidadActual + " se agrego " + cafe
                    + " de cafe");
        }

    }
}
