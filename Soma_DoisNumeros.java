package com.six;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma_DoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite dois numeros para a soma: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int resultado = num1 + num2;

            System.out.println(num1 + " + " + num2 + " = " + resultado);
        }catch (InputMismatchException e){
            System.err.println("Erro! Valor invalido. Por favor, insira um número.");
        }
    }
}
