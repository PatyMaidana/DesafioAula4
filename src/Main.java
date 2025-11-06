import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(3);
        minhaLista.add(0);
        minhaLista.add(2);
        minhaLista.add(1);

        Collections.sort(minhaLista);
        System.out.println("Lista ordenada: " + minhaLista);

        }
    }