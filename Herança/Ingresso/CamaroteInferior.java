package Heranca_Ingressos;

class CamaroteInferior extends VIP {
    private String localizacao;

    public CamaroteInferior(double valor, double adicionalVIP, String localizacao) {
        super(valor, adicionalVIP);
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização no Camarote Inferior: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

   public void setLocalizacao(String localizacao) {
       this.localizacao = localizacao;
   }
}





