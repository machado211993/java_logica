package service;

import java.util.Scanner;
import java.util.ArrayList;
import entity.Alumno;

/* En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
         * Se pide
         * toda la información al usuario y ese Alumno se guarda en una lista de tipo
         * Alumno y se le
         * pregunta al usuario si quiere crear otro Alumno o no. */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();// defino como atributo de la clase para q puedan acceder
    // todos los metodos de la clase

    public void crearAlumno() {
        String opcion = "";
        while (!opcion.equals("salir")) {
            Alumno alumno = new Alumno();
            System.out.println("por favor ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            System.out.println("por favor ingrese las notas 1 2 3 del alumno");
            Integer nota1 = leer.nextInt();
            Integer nota2 = leer.nextInt();
            Integer nota3 = leer.nextInt();
            ArrayList<Integer> notas = new ArrayList<>();
            notas.add(nota1);
            notas.add(nota2);
            notas.add(nota3);
            alumno.setNotas(notas);
            listaAlumnos.add(alumno);
            System.out.println("desea agregar otro alumno?" + "escriba salir si desea finalizar");
            opcion = leer.next();
        }
        for (Alumno a : listaAlumnos) {
            System.out.println(a.getNombre() + " - Notas: " + a.getNotas());
        }

    }

    /*
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota
     * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
     * método. Dentro
     * del método se usará la lista notas para calcular el promedio final de alumno.
     * Siendo este
     * promedio final, devuelto por el método y mostrado en el main.
     */
    public void notaFinal() {
        System.out.println("por favor ingrese el nombre del alumno ");
        String buscar = leer.next();
        boolean encontrado = false;

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(buscar)) {
                encontrado = true;
                ArrayList<Integer> notas = alumno.getNotas();
                double sumaNotas = 0;

                for (Integer nota : notas) {
                    sumaNotas += nota;
                }

                double promedio = sumaNotas / notas.size();
                System.out.println("El promedio de " + buscar + " es: " + promedio);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El alumno no se encuentra en la lista.");
        }

    }

}
