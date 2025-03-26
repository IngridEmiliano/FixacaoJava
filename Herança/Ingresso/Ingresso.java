package Heranca_Ingressos;

 class Ingresso {
     private double valor;

     public Ingresso(Double valor) {
         this.valor = valor;
     }
         public void DadosIngresso () {
             System.out.println("valor: " + getValor());

         }

         public double getValor () {
             return valor;
         }

         public void setValor (Double valor){
             this.valor = valor;
         }
     }

     class IngressoNormal {
     private double valor;

         public double getValor() {
             return valor;
         }

         public void setValor(double valor) {
             this.valor = valor;
         }

         public IngressoNormal(double valor){
         this.valor = valor;


     }
         public void mostrarTipo() {
             System.out.println("Ingresso Normal");

         }
     }



