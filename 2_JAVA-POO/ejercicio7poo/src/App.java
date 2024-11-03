import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 7. Realizar una clase llamada Persona que tenga los siguientes atributos:
         * nombre, edad, sexo
         * ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
         * algún otro
         * atributo, puede hacerlo. Los métodos que se implementarán son:
         * • Un constructor por defecto.
         * • Un constructor con todos los atributos como parámetro.
         * • Métodos getters y setters de cada atributo.
         * • Metodo crearPersona(): el método crear persona, le pide los valores de los
         * atributos al
         * usuario y después se le asignan a sus respectivos atributos para llenar el
         * objeto
         * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H,
         * M o O.
         * Si no es correcto se deberá mostrar un mensaje
         * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
         * en
         * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
         * 20, significa
         * que la persona está por debajo de su peso ideal y la función devuelve un -1.
         * Si la
         * fórmula da por resultado un número entre 20 y 25 (incluidos), significa que
         * la persona
         * está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
         * de la
         * fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y
         * la
         * función devuelve un 1.
         */
        Persona persona = new Persona();
        persona.crearPersona();
        persona.calcularIMC();
        Persona persona2 = new Persona();
        persona2.crearPersona();
        persona2.calcularIMC();
        ArrayList<Persona> personaList = new ArrayList<>();
        personaList.add(persona);
        personaList.add(persona2);
        int tamaño = personaList.size();

        for (Persona variable : personaList) {

            System.out.println(variable);
        }
        System.out.println("el tamaño de lista de personas es " + tamaño);

    }

    public static class Persona {
        /*
         * Realizar una clase llamada Persona que tenga los siguientes atributos:
         * nombre, edad, sexo
         * ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir
         * algún otro
         * atributo, puede hacerlo. Los métodos que se implementarán son:
         * • Un constructor por defecto.
         * • Un constructor con todos los atributos como parámetro.
         * • Métodos getters y setters de cada atributo.
         */
        String nombre;
        int edad;
        String sexo;
        int peso;
        double altura;

        public Persona() {
        }

        public Persona(String nombre, int edad, String sexo, int peso, double altura, Scanner leer) {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
            this.leer = leer;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public Scanner getLeer() {
            return leer;
        }

        public void setLeer(Scanner leer) {
            this.leer = leer;
        }

        /*
         * • Metodo crearPersona(): el método crear persona, le pide los valores de los
         * atributos al
         * usuario y después se le asignan a sus respectivos atributos para llenar el
         * objeto
         * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H,
         * M o O.
         * Si no es correcto se deberá mostrar un mensaje
         */
        Scanner leer = new Scanner(System.in);

        public void crearPersona() {
            System.out.println("por favor ingrese su nombre");
            nombre = leer.next();
            System.out.println("por favor ingrese su edad");
            edad = leer.nextInt();
            System.out.println("por ingrese su sexo");
            sexo = leer.next();
            System.out.println("por ingrese su peso");
            peso = leer.nextInt();
            System.out.println("por favor ingrese su altura");
            altura = leer.nextDouble();

        }
        /*
         * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
         * en
         * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
         * 20, significa
         * que la persona está por debajo de su peso ideal y la función devuelve un -1.
         * Si la
         * fórmula da por resultado un número entre 20 y 25 (incluidos), significa que
         * la persona
         * está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
         * de la
         * fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y
         * la
         * función devuelve un 1.
         */

        public int calcularIMC() {
            double imc = (peso / (altura * altura));
            int resultado = 0;
            if (imc < 20) {
                System.out.println("la persona esta por debajo de su peso ideal");
                resultado = -1;

            } else {
                if (imc >= 20 && imc <= 25) {
                    System.out.println("la persona esta en su peso ideal ");
                    resultado = 0;
                }
                if (imc > 25) {
                    System.out.println("la persona tiene sobrepeso");
                    resultado = 1;
                }
            }
            return resultado;
        }

        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura="
                    + altura + "]";
        }

        /* perfecto */
    }
}
