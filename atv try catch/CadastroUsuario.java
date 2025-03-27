package com.six;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o nome: ");
            String Nome = sc.nextLine();

            System.out.println("Digite a idade: ");
            int Idade = sc.nextInt();

        } catch (DadosInvalidosException e){

        }
    }
}
