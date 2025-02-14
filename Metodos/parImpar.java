package Metodos;
import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int resultado = par_impar(numero);

        showResult(resultado);

        sc.close();
    }

    public static int par_impar (int numero) {
        int parImpar;

        if (numero % 2 == 0) {
            parImpar = 1;
        } else {
            parImpar = 2;
        }
        return parImpar;
    }

    public static void showResult(int parImpar) {
        if (parImpar == 1) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este numero é impar");
        }
    }
}
