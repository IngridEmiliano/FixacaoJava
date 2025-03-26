package heranca;

public class Vendedor extends Empregado {
    private float PersentualComissao;

    public Vendedor(float salario, String nome, float PersentualComissao) {
        super(salario, nome);
        this.PersentualComissao = PersentualComissao;
    }

    public float calcularSalario() {
        return super.getSalario() +(super.getSalario() * (PersentualComissao / 100));
    }
    public void setPersentualComissao(float PersentualComissao) {
        this.PersentualComissao = PersentualComissao;
    }

    @Override
    public String toString() {
        return "Vendedor " +
                "Nome = " + getNome() +
                ", Salario sem Comissao = " + getSalario() +
                ", Persentual de comissao = " + PersentualComissao + "% ";
    }
public void exibirDados() {
    System.out.println("------------ Informação do Vendedor -----------");
    System.out.println("Nome = " + getNome());
    System.out.println("Salario sem Comissão = " + getSalario());
    System.out.println("Salario com Comissão = " + calcularSalario());
    System.out.println("Persentual de comissão = " + PersentualComissao + "%");
    }

}
