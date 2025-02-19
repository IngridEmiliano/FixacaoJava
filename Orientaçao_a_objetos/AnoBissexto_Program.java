package Orientaçao_a_objetos;
import java.util.Scanner;

public class AnoBissexto_Program {
    public static void main(String[] args) { // Criando o scanner para receber os números
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        AnoBissexto_Calculo anoBissextoCalculo = new AnoBissexto_Calculo(ano);
        int bi = anoBissextoCalculo.Verifica_Ano();

        if (bi == 1) {
            System.out.println( "O ano é bissexto");
        } else {
            System.out.println("O ano nao é bissexto");
        }

    }
}

