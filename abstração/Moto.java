package abstração;

 class Moto extends Veiculo {
     Moto(String modelo) {
         super(modelo);
     }

     @Override
     void acelerar() {
         System.out.println("A moto " + modelo + " está acelerando!");

     }
 }
