import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista1 {
    public static void main(String[] args) {
        List<String> listaArray = new ArrayList<>();
        listaArray.add("Item 01");
        listaArray.add("Item 02");
        listaArray.add("Item 03");

        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("Item A");
        listaLinked.add("Item B");
        listaLinked.add("Item C");

        System.out.println("ArrayList: " + listaArray);
        System.out.println("LinkedList: " + listaLinked);

        List<String> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Item 01");
        listaPolimorfica.add("Item 02");
        listaPolimorfica.add("Item 03");
        System.out.println("lista polimorfica 1: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Item A");
        listaPolimorfica.add("Item B");
        listaPolimorfica.add("Item C");

        System.out.println("lista polimorfica 2: " + listaPolimorfica);
    }
}
