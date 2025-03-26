package Heranca_Ingressos;

public class TesteIngresso_ {
        public static void main(String[] args) {
            // Criando objetos de cada tipo de ingresso
            IngressoNormal ingressoNormal = new IngressoNormal(100.0);
            CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200.0, 50.0, "Setor A, Fileira 1, Lugar 5");
            CamaroteInferior camaroteInferior = new CamaroteInferior(150.0, 30.0, "Setor B, Fileira 3, Lugar 15");
            VIP vip = new VIP(300.0, 100.0); // Um ingresso VIP comum


            System.out.println("Dados do Ingresso Normal");
            System.out.println("Valor do ingresso: R$ " + ingressoNormal.getValor());
            System.out.println();

            System.out.println("Dados do Camarote Superior");
            System.out.println("Valor do ingresso: R$ " + camaroteSuperior.getValor());
            camaroteSuperior.imprimirLocalizacao();
            System.out.println();

            System.out.println("Dados do Camarote Inferior");
            System.out.println("Valor do ingresso: R$ " + camaroteInferior.getValor());
            camaroteInferior.imprimirLocalizacao();
            System.out.println();

            System.out.println("Dados do VIP");
            System.out.println("Valor do ingresso VIP: R$ " + vip.getValor());
        }
    }



