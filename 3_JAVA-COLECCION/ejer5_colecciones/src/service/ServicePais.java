package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import entity.Pais;

public class ServicePais {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pais> paises = new ArrayList<>();

    public void crearPais() {
        String opcion = "";
        while (!opcion.equals("salir")) {
            Pais pais = new Pais(); // Esta es la forma correcta de crear y almacenar varios objetos en una lista.
            System.out.println("por favor ingrese un pais");
            pais.setPais(leer.next());
            paises.add(pais);
            System.out.println("quiere ingresar otro pais, escriba salir si desea finalizar");
            opcion = leer.next();
        }
    }

    public void mostrarPaises() {
        for (Pais variable : paises) {
            System.out.println(variable);
        }
    }

    /*
     * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un
     * Iterator, se
     * buscará el país en el conjunto y si está en el conjunto se eliminará el país
     * que ingresó el
     * usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
     * se le informará
     * al usuario
     */

    public void eliminarPais() {
        Iterator<Pais> it = paises.iterator();
        System.out.println("por favor ingrese un pais para eliminar");
        String buscar = leer.next();
        boolean encontrado = false;
        while (it.hasNext()) {// mientras tenga acontinuacion
            Pais pais = it.next();
            if (pais.getPais().equals(buscar)) {
                it.remove();
                System.out.println("El país " + buscar + " ha sido eliminado.");
                encontrado = true;
            }

        }
        if (encontrado == false) {
            System.out.println("el pais ingresado no ha sido encontrado en la lista de paises");
        }
        mostrarPaises();

    }
    /* perfecto */

}
