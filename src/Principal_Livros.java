import java.util.ArrayList;
import java.util.Collections;

public class Principal_Livros {
    public static void main(String[] args) {
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(new Titulo ("Lotr"));
        listaDeTitulos.add(new Titulo("Duna"));
        listaDeTitulos.add(new Titulo("O Pistoleiro"));


        Collections.sort(listaDeTitulos);
        for (Titulo titulo : listaDeTitulos){
            System.out.println(titulo.nome);
        }
    }
}
