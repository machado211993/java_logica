import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo
         * los atributos:
         * numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual
         * (entero). Las
         * operaciones asociadas a dicha clase son:
         * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e
         * interés.
         * b) Agregar los métodos getters y setters correspondientes
         * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
         * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a
         * ingresar
         * y se la sumara a saldo actual.
         * e) Método retirar(double retiro): el método recibe una cantidad de dinero a
         * retirar y se la
         * restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a
         * retirar, se pondrá el
         * saldo actual en 0.
         * f)
         * Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
         * Validar que el
         * usuario no saque más del 20%.
         * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la
         * cuenta.
         * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
         */

        Cuenta cuenta = new Cuenta();
        cuenta.CrearCuenta();
        cuenta.retirar();
        cuenta.ingresar();
        cuenta.extraccionRapida();
        cuenta.consultarDatos();
    }

    public static class Cuenta {
        public int numeroCuenta;
        public int dni;
        public int saldoActual;
        public double interes;

        public Cuenta() {
        }

        public Cuenta(int numeroCuenta, int dni, int saldoActual, double interes) {
            this.numeroCuenta = numeroCuenta;
            this.dni = dni;
            this.saldoActual = saldoActual;
            this.interes = interes;
        }

        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(int numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public int getSaldoActual() {
            return saldoActual;
        }

        public void setSaldoActual(int saldoActual) {
            this.saldoActual = saldoActual;
        }

        public double getInteres() {
            return interes;
        }

        public void setInteres(double interes) {
            this.interes = interes;
        }

        Scanner leer = new Scanner(System.in);

        public void CrearCuenta() {
            System.out.println("por favor ingrese su numero de cuenta");
            System.out.println("por favor ingrese su dni");
            System.out.println("por favor ingrese su saldo actual");
            numeroCuenta = leer.nextInt();
            dni = leer.nextInt();
            saldoActual = leer.nextInt();
            consultarDatos();
        }

        /*
         * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a
         * ingresar
         */
        public void ingresar() {
            System.out.println("por favor ingrese el monto que desea ingresar");
            int ingreso = leer.nextInt();
            saldoActual = saldoActual + ingreso;
            System.out.println("usted a ingresado  " + ingreso + " su saldo quedo en " + saldoActual);
        }
        /*
         * e) Método retirar(double retiro): el método recibe una cantidad de dinero a
         * retirar y se la
         * restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a
         * retirar, se pondrá el
         * saldo actual en 0.
         */

        public void retirar() {
            System.out.println("coloque la cantidad de dinero a retirar");
            int cantidad = leer.nextInt();
            saldoActual = saldoActual - cantidad;
            System.out.println("usted a retirado  " + cantidad + " su saldo quedo en  " + saldoActual);
        }
        /*
         * f)
         * Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
         * Validar que el
         * usuario no saque más del 20%.
         */

        public void extraccionRapida() {
            System.out.println("ingrese el monto que quiere extraer");
            int monto = leer.nextInt();
            int verifica = saldoActual * 20 / 100;
            if (monto > verifica) {
                System.out.println(
                        "el monto que quiere extraer supera el 20 porciento del saldo actual, no es posible realizar, su salgo es de "
                                + saldoActual);

            } else {
                saldoActual = saldoActual - monto;
                System.out.println("la extraccion se realizo satisfactoriamente");
                System.out.println("su saldo es de  " + saldoActual);
            }
        }
        /*
         * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la
         * cuenta.
         */

        public void consultarDatos() {
            System.out.println("los datos del cliente son los siguientes");
            System.out.println("numero de cuenta " + numeroCuenta + " dni " + dni + " saldo actual " + saldoActual);
        }

    }
}
/* hermoso ejercicio */