import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1.
         * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
         * Título, Autor,
         * Número de páginas, y un constructor con todos los atributos pasados por
         * parámetro y un
         * constructor vacío. Crear un método para cargar un libro pidiendo los datos al
         * usuario y
         * luego informar mediante otro método el número de ISBN, el título, el autor
         * del libro y el
         * numero de páginas.
         */

        Libro libro = new Libro();
        libro.crearLibro(libro);
        libro.mostrarlibro(libro);
        libro.mostralibro2(libro);

    }

    public static class Libro {

        String isbn;
        String titulo;
        String autor;
        String numeropagina;

        public Libro() {
        }

        public Libro(String isbn, String titulo, String autor, String numeropagina) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numeropagina = numeropagina;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getNumeropagina() {
            return numeropagina;
        }

        public void setNumeropagina(String numeropagina) {
            this.numeropagina = numeropagina;
        }

        public Libro crearLibro(Libro libro) {
            Scanner leer = new Scanner(System.in);
            System.out.println("por favor ingrese los datos para cargar un libro");
            System.out.println("por favor ingrese isbn");
            libro.setIsbn(leer.next());
            System.out.println("por favor ingrese autor");
            libro.setAutor(leer.next());
            System.out.println("por favor ingrese numero de pagina");
            libro.setNumeropagina(leer.next());
            System.out.println("por favor ingrese titulo");
            libro.setTitulo(leer.next());

            return libro;
        }

        // Método para mostrar los datos del libro
        public void mostrarlibro(Libro libro) {
            System.out.println("Informe del libro:");
            System.out.println("ISBN: " + libro.isbn);
            System.out.println("Título: " + libro.titulo);
            System.out.println("Autor: " + libro.autor);
            System.out.println("Número de páginas: " + libro.numeropagina);
        }

        // utilizando getters
        public void mostralibro2(Libro libro) {
            System.out.println("el isbn es " + libro.getIsbn());
            System.out.println("el titulo es " + libro.getTitulo());
            System.out.println("el autor es " + libro.getAutor());
            System.out.println("los numeros de paginas son " + libro.getNumeropagina());

        }
    }
}
