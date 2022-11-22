package aula5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] lista1 = new String[1];
        lista1[0] = "posição 1";

        String[] lista2 = new String[2];
        lista2[0] = lista1[0];
        lista2[1] = "posição 2";

        List<String> listaProdutos = new ArrayList();
        listaProdutos.add("Creme Dental");
        listaProdutos.add("Shampoo");
        listaProdutos.add("Condicionador");
        listaProdutos.add("Sabonete");

       /* for (String item: listaProdutos) {
            System.out.println(item);
        }*/

        for (int i = 0; i< listaProdutos.size(); i++) {
            System.out.println((i + 1) + " - " + listaProdutos.get(i)); // get pega cada item da lista
        }

        listaProdutos.toArray(); // transforma a lista em um array puro
        //listaProdutos.remove(listaProdutos.get(1));

        System.out.println(listaProdutos);

        //listaProdutos.set(1, "Escova dental");

        listaProdutos.sort( (primeiroValor, segundoValor) -> segundoValor.compareTo(primeiroValor));
        System.out.println(listaProdutos);

        Set<String> lista = new HashSet();
        lista.add("Rayanne");
        lista.add("Camila");
        lista.add("Ana");
        lista.add("Marcele");
        lista.add("Amanda");

        lista.remove("Ana");

        for (String item : lista) {
            System.out.println(item);
        }



    }
}
