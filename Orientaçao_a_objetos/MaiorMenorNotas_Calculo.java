package Orientaçao_a_objetos;

public class MaiorMenorNotas_Calculo {
    public double nota1;
    public double nota2;
    public double nota3;

    public MaiorMenorNotas_Calculo(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double Verificar_MaiorNota() {
        double MaiorNota = nota1;
        if (nota2 > MaiorNota) {
            MaiorNota = nota2;
        }
        if (nota3 > MaiorNota) {
            MaiorNota = nota3;
        }
        return MaiorNota;
    }

    // Método para verificar a menor nota
    public double Verificar_MenorNota() {
        double MenorNota = nota1;
        if (nota2 < MenorNota) {
            MenorNota = nota2;
        }
        if (nota3 < MenorNota) {
            MenorNota = nota3;
        }
        return MenorNota;
    }

}
