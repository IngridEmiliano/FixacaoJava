import java.util.Scanner;

public class Acesso_IndiceInvalido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação de um array fixo
        int[] numeros = {10, 20, 30, 40, 50};

        try {

            System.out.println("Digite o índice para acessar o array (0-4): ");
            int indice = sc.nextInt();
            System.out.println("Elemento no índice " + indice + ": " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");

            sc.close();
        }
    }
}
