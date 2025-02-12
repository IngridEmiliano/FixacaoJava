package For;
import java.util.Scanner;
public class For_18 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite uma palavra: ");
                String texto = scanner.nextLine();

                texto = texto.replaceAll("\\s", "").toLowerCase();

                // Verifica se a string é um palíndromo
                String textoInvertido = new StringBuilder(texto).reverse().toString();

                if (texto.equals(textoInvertido)) {
                    System.out.println("A palavra é um palíndromo.");
                } else {
                    System.out.println("A palavra não é um palíndromo.");
                }

                // Fecha o scanner
                scanner.close();
            }
        }
