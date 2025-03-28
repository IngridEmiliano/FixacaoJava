import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora_MediaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite 3 notas: ");
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A media das tres notas inseridas é: " + media);

        } catch (InputMismatchException e) {
            System.err.println("Erro! Valor invalido. Por favor, insira um número.");

            sc.close();
        }
    }
}