package Metodos;

import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) { // Criando o scanner para receber os números
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        String bi = anoBis(ano);
        System.out.println(bi);

        scanner.close();
    }
    public static String anoBis (int ano){
        String bi;

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {  // Verificando se o ano é bissexto
            bi = "\nO ano é bissexto";
        } else {
            bi = "\nO ano nao é bissexto";
        }

        return bi;
    }
}




