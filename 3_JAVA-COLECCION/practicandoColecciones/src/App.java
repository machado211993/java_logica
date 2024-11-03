import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<Integer> treset = new TreeSet();
        HashMap<Integer, Integer> persona = new HashMap();
        /*
         * Las colecciones constan con funciones para realizar distintas operaciones, en
         * este caso si
         * queremos añadir un elemento a las listas o conjuntos vamos a tener que
         * utilizar la función add(T).
         * Sólo en el caso de los mapas vamos a utilizar la función put(llave,valor).
         */

        listado.add(2);
        listado.add(3);
        listado.add(7);
        System.out.println("el listado es " + listado);

        treset.add(5);
        treset.add(5);
        treset.add(8);

        System.out.println("el treset es " + treset); // no se puede repetir

        persona.put(20, 20);
        persona.put(15, 2);
        persona.put(26, 26);
        System.out.println("mapa es " + persona);

    }

}
