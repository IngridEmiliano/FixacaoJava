package abstração;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Opala");
        Veiculo moto = new Moto("Fazer");

        carro.acelerar();
        moto.acelerar();
    }
}
