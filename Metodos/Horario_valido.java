package Metodos;

import java.util.Scanner;

public class Horario_valido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        double hora = sc.nextDouble();

        double verificaçao = ValidarHorario(hora);

        showResult(verificaçao);

        sc.close();
    }
    public static double ValidarHorario(double hora) {
        double validarHorario;

        if (hora >= 0 && hora < 24) {
            validarHorario = 1;
        } else {
            validarHorario = 2;
        }
        return validarHorario;
    }
    public static void showResult(double validarHorario) {
        if (validarHorario == 1) {
            System.out.println("O horario é valido");
        } else {
            System.out.println("O horario não é valido");
        }
    }
    }