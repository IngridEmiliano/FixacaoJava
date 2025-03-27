public class Desenvolvedor extends Funcionarios {


    public Desenvolvedor(String Nome, Float SalarioBase) {
        super(Nome, SalarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10;
    }
}
