package Orientaçao_a_objetos;

import java.util.Scanner;

public class MaiorMenorNotas_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        MaiorMenorNotas_Calculo maiormenornotas_calculo = new MaiorMenorNotas_Calculo(nota1, nota2, nota3);

        double ResultadoMaior = maiormenornotas_calculo.Verificar_MaiorNota();
        double ResultadoMenor = maiormenornotas_calculo.Verificar_MenorNota();

        System.out.println("A maior nota inserida foi: " + ResultadoMaior);
        System.out.println("A menor nota inserida foi: " + ResultadoMenor);

        sc.close();
    }
}