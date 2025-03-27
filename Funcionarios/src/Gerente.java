public class Gerente extends Funcionarios {
    private double Bonus;

    public Gerente(String Nome, Float SalarioBase, Float Bonus){
        super(Nome,SalarioBase);
       this.Bonus = Bonus;
    }
    public double calcularSalario() {
        return getSalarioBase() + Bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(Float bonus) {
        Bonus = bonus;
    }

}
