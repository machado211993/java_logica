package entity;

/*4. Un cine necesita implementar un sistema en el que se puedan cargar
         * peliculas. Para esto,
         * tendremos una clase Pelicula con el título, director y duración de la
         * película (en horas).
         * Implemente las clases y métodos necesarios para esta situación, teniendo en
         * cuenta lo
         * que se pide a continuación: */
public class Pelicula {
    String titulo;
    String director;
    double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

}
