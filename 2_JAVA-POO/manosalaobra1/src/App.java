public class App {
    public static void main(String[] args) throws Exception { // el metodo main es lo primero que se ejecuta
        /*
         * EJERCICIO PERSONA
         * Es tu turno, crea tu propio proyecto con la clase Persona.
         */

        Persona p1 = new Persona();
        p1.crearPersona();
        System.out.println(
                "yo soy el programador  " + p1.nombre + " tengo la edad de  " + p1.edad + " mi dni es " + p1.dni);

    }

    public static class Persona { // luego tengo la clase persona con sus metodos crear persona
        String nombre;
        String edad;
        String dni;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEdad() {
            return edad;
        }

        public void setEdad(String edad) {
            this.edad = edad;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public Persona(String nombre, String edad, String dni) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
        }

        public Persona() {
        }

        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
        }

        public Persona crearPersona() {

            Persona persona = new Persona();
            nombre = "jose manuel";
            edad = "31";
            dni = "37809472";
            return persona;
        }

    }

} // todo esta dentro de la clase app
