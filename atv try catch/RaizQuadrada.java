import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Qual numero deseja saber a raiz quadrada? ");
            double numero = sc.nextDouble();

            // Verifica se o número é negativo primeiro
            if (numero < 0) {
                /* throw new é utilizado para lançar uma exceção manualmente em Java.
                Quando você deseja interromper o fluxo normal do programa devido a
                um erro ou condição específica*/
                throw new IllegalArgumentException("Erro! O numero inserido não é válido, pois é negativo. Tente novamente com um número positivo.");
            }

            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);

            // Captura a exceção lançada pelo throw e permite tratar o erro.
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());

            sc.close();
        }
    }
}
