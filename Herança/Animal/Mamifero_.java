package heranca;

public class Mamifero_ extends Animal_ {
    private String Alimento;

    public Mamifero_(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        Alimento = alimento;
    }

    public void DadosMamiferos(){
        super.DadosdoAnimal();
        System.out.println("Dados Mamifero: " + getAlimento());
        System.out.println("---------------------------------------------");
    }
    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }
}
