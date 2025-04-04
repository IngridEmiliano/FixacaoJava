import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Atv_arquivo14 {
    public static void main(String[] args) {
        System.out.println("Gerando o arquivo summary.csv...");

        // Criou-se um vetor adicionando o que será escrito no arquivo
        String[] lines = new String[]{
                "Produto; Preço; Quantidade", // Cabeçalho
                "TV LED; 1290.99; 1",
                "Video Game Chair; 350.50; 3",
                "Iphone X; 900.00; 2",
                "Samsung Galaxy9; 850.00; 2"
        };

        // Caminho onde o arquivo vai ficar (summary.csv = nome do arquivo)
        String path = "C:\\Users\\Aluno_Tarde\\Ingrid\\out\\summary.csv";

        // Cria um objeto File para representar o arquivo
        File file = new File(path);

        // Criar diretórios se necessários
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs(); // Garante que todos os diretórios necessários sejam criados
        }

        // Abre o arquivo para escrita
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            // Processa os dados
            for (int i = 1; i < lines.length; i++) { // O laço começa em 1, pois a linha 0 é o cabeçalho
                String[] parts = lines[i].split(";"); // Divide a linha em partes (nome, preço, quantidade)

                // Verifica se a linha tem o formato correto (3 partes)
                if (parts.length == 3) {
                    //trim() = Remove espaços extras ao redor do nome
                    //parts[1] = posição no vetor
                    String nome = parts[0].trim();
                    double preco = Double.parseDouble(parts[1].trim());
                    int quantidade = Integer.parseInt(parts[2].trim());

                    // Calcula o valor total
                    double valorTotal = preco * quantidade;

                    bw.write(nome + "; " + String.format("%.2f", valorTotal));
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Arquivo criado com sucesso: " + path);
    }
}
