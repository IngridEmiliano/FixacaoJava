package Metodos;

import java.util.Scanner;

public class MaiorMenorNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        Notas notas = new Notas(nota1, nota2, nota3);

     
        double maiorNota = notas.calcularMaiorNota();
        double menorNota = notas.calcularMenorNota();

        // Exibindo o resultado
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);

        sc.close();
    }

    public static class Notas {
        private double nota1, nota2, nota3;

        public Notas(double nota1, double nota2, double nota3) {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        // Método para calcular a maior nota
        public double calcularMaiorNota() {
            double maiorNota = nota1;
            if (nota2 > maiorNota) {
                maiorNota = nota2;
            }
            if (nota3 > maiorNota) {
                maiorNota = nota3;
            }
            return maiorNota;
        }

        // Método para calcular a menor nota
        public double calcularMenorNota() {
            double menorNota = nota1;
            if (nota2 < menorNota) {
                menorNota = nota2;
            }
            if (nota3 < menorNota) {
                menorNota = nota3;
            }
            return menorNota;
        }
    }
}
