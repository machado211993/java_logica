import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> personas = new HashMap();
        String n1 = "albus";
        String n2 = "severus";
        personas.put(n1, n2);

        System.out.println(personas);

        HashSet<String> nombres = new HashSet();
        nombres.add("carmen");
        nombres.add("joaquin");
        nombres.add("manolo");

        for (String recorrer : nombres) {
            System.out.println(recorrer);
        }
        System.out.println("");
        LinkedHashSet<String> frases = new LinkedHashSet();
        frases.add("manu");
        frases.add("fran");
        frases.add("milu");
        frases.add("silvi");
        frases.add("josefina");
        for (String variable : frases) {
            System.out.println(variable);
        }
        System.out.println("");
        ArrayList<String> lista = new ArrayList();
        lista.add("coqui");
        lista.add("arami");
        lista.add("negrito");
        lista.addAll(0, lista);
        lista.addAll(lista);// añade dentro de la lista otra lista
        for (String string : lista) {
            System.out.println(string);
        }
        System.out.println("");
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {// mientras tenga acontinuacion
            if (it.next().equals("arami")) {
                it.remove();
            }
        } ///recorre toda la lista buscando arami. y elimina todas

        for (String string : lista) {
            System.out.println(string);
        }
        System.out.println("");

        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("cafe");
        bebidas.add("te");
        Iterator<String> it2 = bebidas.iterator();

        while (it2.hasNext()) {
            if (it2.next().equals("cafe")) {
                it2.remove();
            }
        }

        for (String recorre : bebidas)
            System.out.println(recorre);
        {

        }
    }
}
/* me quede en iterator */