package aula6;

import java.io.*;

public class Manipulação {
    public static void main(String[] args) throws IOException {
        File arq = new File("C:\\Users\\ACER\\IdeaProjects\\teste\\src\\arquivo.txt");
        arq.createNewFile();
       /* FileWriter escrever = new FileWriter(arq);
        escrever.append("Aula 6 ").append("Manipulação de arquivos");
        escrever.write(" try/catch");
        escrever.close();*/

        PrintWriter escreva = new PrintWriter(new FileOutputStream(arq, false));
        escreva.println(" Primeira linha");
        escreva.println("Segundo linha");
        escreva.close();
        BufferedReader leitor = new BufferedReader(new FileReader(arq));
        while (leitor.ready()) {
            String linha = leitor.readLine();
            System.out.println("Linha: " + linha);
        }
        leitor.close();
    }
}
