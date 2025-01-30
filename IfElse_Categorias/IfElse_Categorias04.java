package IfElse_Categorias;
import java.util.Scanner;


public class IfElse_Categorias04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a pressão Sistolica: ");
        double sistolica= sc.nextDouble();

        System.out.print("digite a pressão Diastólica: ");
        double diastolica = sc.nextDouble();

        double arterial = (sistolica + (2 * diastolica )) / 3;

        if (arterial <= 90) {
            System.out.println ("Pressão arterial considerada normal " + arterial);
        } else if (arterial > 90 && arterial <= 100) {
            System.out.println ("Pressão arterial considerada moderada " + arterial);
        }else {
            System.out.println ("Pressão arterial considerada alta " + arterial);
        }
        sc.close();
    }
}
