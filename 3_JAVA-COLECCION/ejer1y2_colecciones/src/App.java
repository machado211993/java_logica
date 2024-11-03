import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de
         * tipo String. El
         * programa pedirá una raza de perro en un bucle, el mismo se guardará en la
         * lista y
         * después se le preguntará al usuario si quiere guardar otro perro o si quiere
         * salir. Si decide
         * salir, se mostrará todos los perros guardados en el ArrayList.
         */

        String opcion = "";
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList<>();

        while (!opcion.equals("salir")) {
            System.out.println("por favor ingrese la raza de perro");
            razas.add(leer.next());
            System.out.println("si dese salir escriba salir, sino oprima cualquier tecla para continuar");
            opcion = leer.next();
        }

        System.out.println("usted salio");
        System.out.println("");

        for (String recorrer : razas) {
            System.out.println(recorrer);
        }

        /*
         * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
         * se le pedirá
         * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la
         * lista. Si el perro
         * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
         * la lista
         * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
         * y se mostrará
         * la lista ordenada.
         */

        System.out.println("ingrese un perro para buscarlo");
        String perro = leer.next();
        Iterator<String> it = razas.iterator();
        boolean encontrado = false;

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(perro)) {
                it.remove();
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("\nLa raza '" + perro + "' ha sido eliminada.");
        } else {
            System.out.println("\nLa raza '" + perro + "' no se encontró en la lista.");
        }
        // Mostrar la lista ordenada alfabéticamente
        razas.sort(String::compareToIgnoreCase);
        System.out.println("\nLista ordenada de razas:");
        for (String raza : razas) {
            System.out.println(raza);
        }

        leer.close();
        /* espectacular */
    }
}
