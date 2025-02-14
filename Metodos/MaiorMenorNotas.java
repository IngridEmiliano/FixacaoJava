package Metodos;

import java.util.Scanner;

public class MaiorMenorNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        // Criando o objeto Notas
        Notas notas = new Notas(nota1, nota2, nota3);

        // Calculando a maior e menor nota
        double maiorNota = notas.calcularMaiorNota();
        double menorNota = notas.calcularMenorNota();

        // Exibindo o resultado
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);

        sc.close();
    }

    // Classe para armazenar as notas e calcular maior e menor
    public static class Notas {
        private double[] notas; // Usando um array para armazenar as notas

        // Construtor para inicializar as notas
        public Notas(double nota1, double nota2, double nota3) {
            this.notas = new double[]{nota1, nota2, nota3};
        }

        // Metodo para calcular a maior nota
        public double calcularMaiorNota() {
            double maiorNota = notas[0]; // Inicializa com a primeira nota
            for (double nota : notas) {
                if (nota > maiorNota) {
                    maiorNota = nota;
                }
            }
            return maiorNota;
        }

        // Metodo para calcular a menor nota
        public double calcularMenorNota() {
            double menorNota = notas[0]; // Inicializa com a primeira nota
            for (double nota : notas) {
                if (nota < menorNota) {
                    menorNota = nota;
                }
            }
            return menorNota;
        }
    }
}
