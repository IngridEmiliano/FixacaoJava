package Metodos;

import java.util.Scanner;

public class categoria_pelaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        int categoria = Verificacao(idade);

        showResult (categoria);

        sc.close();
    }

    public static int Verificacao(int idade) {
        int aux;

        if (idade >= 0 && idade <= 11) {
            aux = 1;
        } else if (idade >= 12 && idade <= 17) {
            aux = 2;
        } else if (idade >= 18 && idade <= 59) {
            aux = 3;
        } else if (idade >= 60) {
            aux = 4;
        } else {
            aux = -1;
        }
        return aux;
    }

        public static void showResult (int aux){
            if (aux == 1) {
                System.out.println("Criança");
            } else if (aux == 2) {
                System.out.println("Adolescente");
            } else if (aux == 3) {
                System.out.println("Adulto");
            } else if (aux == 4) {
                System.out.println("Idoso");
            } else {
                System.out.println("Erro");
            }
        }
}

