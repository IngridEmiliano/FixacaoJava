package Orientaçao_a_objetos;
import java.util.Scanner;

public class Horario_validoProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        double hora = sc.nextDouble();

        Horario_validoCalculo horario_validocalculo = new Horario_validoCalculo(hora);

        double resultadoValidacao = horario_validocalculo.VerificaHora();

        if (resultadoValidacao == 1) {
            System.out.println("O horario é valido");
        } else {
            System.out.println("O horario não é valido");

            sc.close();
        }
    }
}