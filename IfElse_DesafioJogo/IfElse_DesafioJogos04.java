package IfElse_DesafioJogo;

import java.util.Scanner;

public class IfElse_DesafioJogos04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro número:" );
        int num3 = sc.nextInt();

        int[] numeros = {num1, num2, num3};

        System.out.println("Números em ordem crescente:");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        sc.close();
    }
}

