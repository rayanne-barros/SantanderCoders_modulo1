package aula6;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUDEx {
    static List<String> listaContatos = new ArrayList<>();
    static Path path = Paths.get("C:\\Users\\ACER\\IdeaProjects\\teste\\src\\arquivo.txt");

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        /*
        Menu
        1 - Cadastrar contatos
        2 - Listar contatos
        3 - Sair
        * */
        boolean continuar=true;
        String opcaoEntrada;

        while(continuar){
            System.out.println("Escolha um das opções abaixo");
            System.out.println("1-Cadastrar contato");
            System.out.println("2-Listar contatos");
            System.out.println("3-Sair");
            opcaoEntrada = input.nextLine();
            switch (opcaoEntrada){
                case "1"-> cadastrarContato(input);
                case "2"-> listarContato();
                case "3"-> continuar=false;
                default-> System.out.println("Opção inválida");
            }
        }




    }

    public static void cadastrarContato(Scanner input) throws IOException {
        System.out.println("Digite: o nome do seu contato");
        String nome = input.nextLine();

        System.out.println("Digite: o telefone do seu contato");
        String telefone = input.nextLine();

        System.out.println("Digite: o email do seu contato");
        String email = input.nextLine();

        if(!Files.exists(path)){
            Files.createFile(path);
        }
        Files.writeString(path, nome+"|"+telefone+"|"+email+"\n", StandardOpenOption.APPEND);
    }
    public static void listarContato() throws IOException {
        List<String> listaStrings = Files.readAllLines(path);
        String nome, email, telefone;
        Integer numeroContato=1;

        for(String string: listaStrings){
            nome = string.split("\\|")[0];
            telefone = string.split("\\|")[1];
            email = string.split("\\|")[2];
            System.out.printf("Contato: %d | Nome: %s | Telefone: %s | Email: %s\n", numeroContato, nome, telefone,
                    email);
            numeroContato++;
        }

    }

}
