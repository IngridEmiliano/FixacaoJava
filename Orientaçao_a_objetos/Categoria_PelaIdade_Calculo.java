package Orientaçao_a_objetos;

public class Categoria_PelaIdade_Calculo {

    public int idade;

    public Categoria_PelaIdade_Calculo(int idade) {
        this.idade = idade;
    }

    public int Verifica_idade() {
        int aux;

        if (idade >= 0 && idade <= 11) {
            aux = 1;
        } else if (idade >= 12 && idade <= 17) {
            aux = 2;
        } else if (idade >= 18 && idade <= 59) {
            aux = 3;
        } else if (idade >= 60) {
            aux = 4;
        } else {
            aux = -1;
        }
        return aux;
    }
}