package Heranca_Ingressos;

class CamaroteSuperior extends VIP {
        private double AdicionalSuperior;
         private String localizacao;

        public CamaroteSuperior(double valor, double adicionalVIP, String localizacao) {
            super(valor, adicionalVIP);
            this.AdicionalSuperior = AdicionalSuperior;
        }

        public void imprimirLocalizacao() {
        System.out.println("Localização no Camarote Superior: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}

