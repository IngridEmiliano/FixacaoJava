package Metodos;

public class MaiorValorEntreTres_Calculo {
    public int a;
    public int b;
    public int c;

    public MaiorValorEntreTres_Calculo ( int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int VerificarMaiorNumero (){
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > a && b > c) {
            aux = b;
        }else {
            aux = c;

        }
        return aux;
    }
}
