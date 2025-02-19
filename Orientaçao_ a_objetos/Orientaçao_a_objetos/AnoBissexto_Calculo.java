package Orientaçao_a_objetos;

public class AnoBissexto_Calculo {

    public int ano;

    public AnoBissexto_Calculo(int ano){
        this.ano = ano;
    }
    public int Verifica_Ano(){
        int bi;

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {  // Verificando se o ano é bissexto
            bi = 1;
        } else {
            bi = 0;
        }
        return bi;
    }
}
