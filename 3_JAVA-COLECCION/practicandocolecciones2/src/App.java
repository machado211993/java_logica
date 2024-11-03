import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombre = new ArrayList(); // LISTA
        String x = "manuel";
        nombre.add(x);
        nombre.add("jose");
        nombre.add("francisco");
        nombre.add("milagros");
        nombre.add("roque");
        nombre.add("silvina");
        nombre.add("josefina");

        nombre.remove("jose");

        HashSet<String> apellido = new HashSet(); // CONJUNTO
        apellido.add("machado");
        apellido.add("urreli");
        apellido.add("galvez");
        apellido.add("gomez");

        apellido.remove("galvez");

        HashMap<Integer, String> mapa = new HashMap<>(); // MAPA
        String apodo = "mcguiber";
        mapa.put(37809472, apodo);
        mapa.put(36027229, "may");
        mapa.put(14460952, "papa");
        mapa.remove(37809472);

        System.out.println("el arraylist es " + nombre);
        System.out.println("el hashSet es " + apellido);
        System.out.println("el hashmap es " + mapa);

        for (String mostrar : nombre) {
            System.out.println(mostrar);
        }
        System.out.println("");
        for (String mostrar2 : apellido) {
            System.out.println(mostrar2);
        }
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println("documento " + entry.getKey() + " apodo " + entry.getValue());
        }

        /* excelente */
    }
}
