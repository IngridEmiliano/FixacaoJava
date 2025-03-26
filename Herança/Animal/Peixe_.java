package heranca;

public class Peixe_ extends Animal_ {
    private String caracteristica;

    public Peixe_() {
        super();
    }
    public Peixe_(String nome, float comprimento,int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }
    public void DadosPeixe(){
        super.DadosdoAnimal();
        System.out.println("Caracteristica: " + getCaracteristica());
        System.out.println("-------------------------------------------------------");
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

}
