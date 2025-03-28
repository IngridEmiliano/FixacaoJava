import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira o nome: ");
            String nome = sc.nextLine();

            System.out.println("Insira a idade: ");
            int idade = sc.nextInt();

            if (nome.isEmpty()) {
                throw new DadosInvalidosException("Erro! nome vazio");
            }
                if (idade < 0){
                    throw new DadosInvalidosException ("Erro! idade negativa");
                }

        } catch (DadosInvalidosException e){
            System.out.println("Exceção: " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
