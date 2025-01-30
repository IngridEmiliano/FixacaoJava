package IfElse_DataHora;

import java.util.Scanner;

public class IfElse_DataHora03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um dia: ");
        double dia = sc.nextDouble();

        System.out.print("digite um mês: ");
        double mes = sc.nextDouble();

        System.out.print("digite um ano: ");
        double ano = sc.nextDouble();

        if (mes > 1 && mes < 12) {
            System.out.println("mês valido!");
        } else {
            System.out.println(" o mês informado não é valido");

        }
    }
}


