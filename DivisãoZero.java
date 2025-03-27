package com.six;

import java.util.Scanner;

public class DivisãoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite dois numeros inteiros:");
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();

            double resultado = numerador / denominador;
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (ArithmeticException e) {

            System.err.println("Erro! Não é possivel dividir por zero"); //err = mensagem de rro

            sc.close();
        }
    }
}
