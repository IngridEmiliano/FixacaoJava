public abstract class Funcionarios {
    String Nome;
    Float SalarioBase;

    public Funcionarios(String Nome, Float SalarioBase){
        this.Nome = Nome;
        this.SalarioBase = SalarioBase;
    }

    public abstract double calcularSalario();


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Float getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Float salarioBase) {
        SalarioBase = salarioBase;
    }
}
