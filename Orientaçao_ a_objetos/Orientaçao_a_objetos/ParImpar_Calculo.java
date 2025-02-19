package Orientaçao_a_objetos;

public class ParImpar_Calculo {
    public int numero;

    public ParImpar_Calculo (int numero){
        this.numero = numero;
    }
    public int Verifica_ParImpar () {
        int parImpar;

        if (numero % 2 == 0) {
            parImpar = 1;
        } else {
            parImpar = 2;
        }
        return parImpar;
    }

}
