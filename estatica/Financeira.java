package estatica;

public class Financeira {
    public static double calcularJurosSimples(double capital, double taxa, int tempo) {
        return capital *taxa *tempo;
    }

    public static double converterMoeda(double valor, double taxaCambio) {
        return valor * taxaCambio;
    }
}

