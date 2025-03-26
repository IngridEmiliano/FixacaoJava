package heranca;

public class Gerente extends Empregado {
    private String Departamento;

    public Gerente(float salario, String nome, String Departamento) {
        super(salario, nome);
        this.Departamento = Departamento;
    }

@Override
public String toString() {
    return "Gerente" +
            "Nome =" + getNome() + "/" +
            ", Salario =" + getSalario() + "/" +
            "Informações departamento =" + getDepartamento();

}

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
}

