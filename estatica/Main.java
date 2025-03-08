package estatica;

class Main {
    public static void main(String[] args) {

    double capital = 1000.0;
    double taxa = 0.05;
    int tempo = 2; // 2 anos
    double jurosSimples = Financeira.calcularJurosSimples(capital, taxa, tempo);
        System.out.println("Juros Simples: " + jurosSimples);


    double valorEmReais = 150.0;
    double taxaCambio = 5.5;  
    double valorConvertido = Financeira.converterMoeda(valorEmReais, taxaCambio);
        System.out.println("Valor convertido: " + valorConvertido + " dólares");
}
}
