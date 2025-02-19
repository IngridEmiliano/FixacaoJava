package Orientaçao_a_objetos;
import java.util.Scanner;

public class Categoria_PelaIdade_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        Categoria_PelaIdade_Calculo categoria_pelaIdade_calculo = new Categoria_PelaIdade_Calculo(idade);

        int aux = categoria_pelaIdade_calculo.Verifica_idade();

        if (aux == 1) {
            System.out.println("Crança");
        } else if (aux == 2) {
            System.out.println("Adolescente");
        } else if (aux == 3) {
            System.out.println("Adulto");
        } else if (aux == 4) {
            System.out.println("Idoso");
        } else {
            System.out.println("Erro");
        }

        sc.close();

    }
}
