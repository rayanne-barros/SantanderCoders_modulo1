package aula6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\ACER\\IdeaProjects\\teste\\src\\arquivo.txt");
        Files.writeString(path, "Olá, seja bem-vindo... \n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);

        List<String> lista = Files.readAllLines(path, StandardCharsets.UTF_8);
        String listaString = String.join("\n", lista.toString()
                .substring(1, lista.toString().length()- 1)
                .split(","));
        Files.writeString(path, listaString);
        System.out.println(lista + "\n");
        System.out.println(listaString);

    }
}
