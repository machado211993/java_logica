package service;
/* En el servicio deberemos tener un bucle que crea un objeto Pelicula
         * pidiéndole al usuario
         * todos sus datos y guardándolos en el objeto Pelicula.
         * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
         * usuario si quiere
         * crear otra Pelicula o no. */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import entity.Pelicula;

public class PeliculaServicio {
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void crearPelicula() {
        String opcion = "";
        while (!opcion.equals("salir")) {
            Pelicula pelicula = new Pelicula();
            System.out.println("por favor ingrese el titulo de la pelicula");
            pelicula.setTitulo(leer.next());
            System.out.println("por favor ingrese el director de la pelicula");
            pelicula.setDirector(leer.next());
            System.out.println("por favor ingrese la duracion de la pelicula en horas");
            pelicula.setDuracion(leer.nextDouble());
            peliculas.add(pelicula); // añado todo los atributos al arreglo de peliculas
            System.out.println("desea ingresar otra pelicula, escriba salir para finalizar");
            opcion = leer.next();
        }
    }

    /*
     * Después de ese bucle realizaremos las siguientes acciones:
     * 22
     * • Mostrar en pantalla todas las películas.
     */
    public void mostraPeliculas() {
        for (Pelicula p : peliculas) {
            System.out.println(p.getTitulo() + " - Director: " + p.getDirector() + " - Duracion: " + p.getDuracion());

        }

    }

    public void mostraPeliculasMayores1h() {
        for (Pelicula p : peliculas) {

            if (p.getDuracion() > 1) {
                System.out.println("las peliculas mayores a 1 hora de duracion son ");
                System.out
                        .println(p.getTitulo() + " - Director: " + p.getDirector() + " - Duracion: " + p.getDuracion());
            }

        }
    }

    public void ordenarPorDuracionMayorAMenor() {
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());// orden mayor a menor
        System.out.println("\nPelículas ordenadas por duración (de mayor a menor):");
        for (Pelicula p : peliculas) {
            System.out.println(p.getTitulo() + " - Director: " + p.getDirector() + " - Duracion: " + p.getDuracion());

        }
    }

    public void ordenarPorDuracionMenorAMayor() {
        peliculas.sort(Comparator.comparingDouble(Pelicula::getDuracion)); // orden menor a mayor
        System.out.println("\nPelículas ordenadas por duración (de menor a mayor):");
        for (Pelicula p : peliculas) {
            System.out.println(p.getTitulo() + " - Director: " + p.getDirector() + " - Duracion: " + p.getDuracion());

        }
    }

    public void ordenarPorTituloAlfabetico() {
        peliculas.sort(Comparator.comparing(Pelicula::getTitulo)); // aca ordena la lista
        System.out.println("\nPelículas ordenadas por título alfabéticamente:");
        for (Pelicula p : peliculas) {
            System.out.println(p.getTitulo() + " - Director: " + p.getDirector() + " - Duracion: " + p.getDuracion());

        }
    }

    public void ordenarPorDirectorAlfabetico() {
        peliculas.sort(Comparator.comparing(Pelicula::getDirector)); // aca ordena
        System.out.println("\nPelículas ordenadas por director alfabéticamente:");
        for (Pelicula p : peliculas) {
            System.out.println(p.getTitulo() + " - Director: " + p.getDirector() + " - Duracion: " + p.getDuracion());

        }
    }

}
