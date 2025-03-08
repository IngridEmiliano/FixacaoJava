package abstração;

abstract class Veiculo {
    String modelo;
    Veiculo(String modelo) {
        this.modelo = modelo;
    }

    abstract void acelerar();
}

