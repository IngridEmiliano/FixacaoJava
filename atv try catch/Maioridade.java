import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira a idade: ");
            int idade = sc.nextInt();

            if (idade < 0) {
                throw new IdadeInvalidaException("Idade negativa não é permitida");
            }

            if (idade >= 18) {
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você é menor de idade!");
            }

        } catch (IdadeInvalidaException e) {
            System.out.println("Exceção: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
