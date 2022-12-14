package aula5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMap {
    public static void main(String[] args) {

        Map<String, Object> objeto = new HashMap<>();
        pegarInformacoes(objeto);
        imprimeObjeto(objeto);



        // Map<String, Object> objeto = new HashMap<>();
        /*objeto.put("nome", "Rayanne"); // chave e valor
        objeto.put("idade", 27);*/

       /* final String listaFormatada = "\n \n";

        objeto.forEach((chave, valor) -> {listaFormatada += chave + " - " + valor + "\n";} );*/

        /*Map<String, Object> objeto = Map.of("nome", "Rayanne", "idade", 27, "nome2", "Ana");
        Integer idade = (Integer) objeto.get("idade");
        String nome =(String) objeto.get("nome");
        System.out.println(idade);
        System.out.println(nome);
        System.out.println(objeto);*/

    }

    public static void imprimeObjeto(Map<String, Object> objeto) {
        String listaFormatada = "\n \n";
        for( Map.Entry entry : objeto.entrySet()) {
            listaFormatada += entry.getKey() + " - " + entry.getValue() + "\n";
        }

        System.out.println(listaFormatada);
    }

    public static void pegarInformacoes(Map<String, Object> objeto) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Integer idade = input.nextInt();
        input.nextLine();
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite seu sexo: ");
        String sexo = input.nextLine();

        objeto.put("nome", nome);
        objeto.put("idade", idade);
        objeto.put("sexo", sexo);
    }
}
