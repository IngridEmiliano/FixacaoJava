package heranca;

public class Empregado {
    protected float salario;
    private String nome;

    public Empregado(float salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado" +
                "Nome =" +getNome() + "/" +
                ", Salario =" + getSalario();

    }

    public void exibirEmpregado() {
        System.out.println("---------- INFORMAÇÃO DE EMPREGADO ----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario" + getSalario());
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
