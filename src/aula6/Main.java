package aula6;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try {


            pegarDados();
            //throw new NullPointerException();

        }/* catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("executou o catch Input" + e.getMessage());
        }*/
        catch (Exception e) {
            System.out.println("Executou o catch ");

        } finally {
            System.out.println("Executou o finally"); // Sempre será executado
        }

    }

    public static void pegarDados() {
        /*Scanner input = null;
        System.out.println("Digite algo: ");
        int dado = input.nextInt();*/
        try {
            File arq = new File("C:\\Users\\ACER\\IdeaProjects\\teste\\src\\Main.java");
            arq.createNewFile();
        } catch (Exception e) {
            System.out.println("Entrou no pegar dados");
        }


    }
}
