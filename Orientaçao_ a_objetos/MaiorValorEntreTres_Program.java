package Metodos;
import java.util.Scanner;

public class MaiorValorEntreTres_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 3 numeros: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        MaiorValorEntreTres_Calculo maiorvalorentretres_calculo = new MaiorValorEntreTres_Calculo(a, b, c);

        int aux = maiorvalorentretres_calculo.VerificarMaiorNumero();

        System.out.println("Maior numero: " + aux);

        sc.close();

    }
}
