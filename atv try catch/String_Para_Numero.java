package com.six;

import java.util.Scanner;

public class String_Para_Numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira um numero:");
            String resposta = sc.nextLine(); //ler a entrada do usuario como uma string
            int numero = Integer.parseInt(resposta); //tenta ler a entrada como numero
            System.out.println("Número inserido: " + numero);

        } catch (NumberFormatException e) {
            System.err.println("Erro! Valor invalido. Por favor, insira um número inteiro.");

        }
    }
}