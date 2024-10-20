import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 2. Declarar una clase llamada Circunferencia que tenga como atributo privado
         * el radio de
         * tipo real. A continuación, se deben crear los siguientes métodos:
         * a) Método constructor que inicialice el radio pasado como parámetro.
         * b) Métodos get y set para el atributo radio de la clase Circunferencia.
         * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el
         * atributo del
         * objeto.
         * d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗
         * 𝐫𝐚𝐝𝐢𝐨𝟐).
         * e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗
         * 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
         */
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.crearCircunferencia(circunferencia);
        circunferencia.perimetro(circunferencia);
        circunferencia.area(circunferencia);
    }

    public static class Circunferencia {
        private double radio;

        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public Circunferencia() {
        }

        public Circunferencia(double radio) {
            this.radio = radio;
        }
        /*
         * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el
         * atributo del
         * objeto.
         */

        public Circunferencia crearCircunferencia(Circunferencia circunferencia) {
            Scanner leer = new Scanner(System.in);
            System.out.println("por favor ingrese el radio");
            circunferencia.setRadio(leer.nextDouble());
            return circunferencia;
        }

        /*
         * d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗
         * 𝐫𝐚𝐝𝐢𝐨𝟐).
         */

        public void area(Circunferencia circunferencia) {
            double area = Math.PI * Math.pow(circunferencia.radio, 2);

            System.out.println("el area de la circunferencia es  " + area);
        }

        /*
         * Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑
         * ∗ 𝐫𝐚𝐝𝐢𝐨).
         */

        public void perimetro(Circunferencia circunferencia) {
            double perimetro = 2 * Math.PI * (circunferencia.radio);
            System.out.println("el perimetro de la circunferencia es  " + perimetro);
        }

        /* excelente */

    }

}
