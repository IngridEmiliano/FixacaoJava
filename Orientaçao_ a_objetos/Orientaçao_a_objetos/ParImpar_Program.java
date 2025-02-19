package Orientaçao_a_objetos;
import java.util.Scanner;
public class ParImpar_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        ParImpar_Calculo parimpar_calculo = new ParImpar_Calculo(numero);

        int parImpar = parimpar_calculo.Verifica_ParImpar();

        if (parImpar == 1) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este numero é impar");
        }
        sc.close();
    }
}