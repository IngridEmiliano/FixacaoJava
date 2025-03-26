package heranca;

public class TestaAnimais {
    public static void main(String[] args) {
     Mamifero_ Camelo = new Mamifero_(" camelo",  150,  4, " Amarelo", " terra",  2.0f, " ");
     Peixe_ tubarao = new Peixe_(" tubarão",  300,  0, " Cinzento", " Mar",  1.5f, " Barbatanas e caldas");
     Mamifero_ ursoCanada = new Mamifero_ (" Urso-do-Canadá",  180,  4, " Vermelho", " terra",  0.5f, " Mel");

        System.out.println("Dados do Camelo");
        Camelo.DadosMamiferos();
        System.out.println();

        System.out.println("Dados do Tubarão");
        tubarao.DadosPeixe();
        System.out.println();

        System.out.println("Dados do Urso-do-Canadá");
        ursoCanada.DadosMamiferos();
    }
}
