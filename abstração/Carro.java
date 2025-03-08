package abstração;

class Carro extends Veiculo{
    Carro(String modelo) {
        super(modelo);
    }

    @Override
    void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando!");

    }
}
