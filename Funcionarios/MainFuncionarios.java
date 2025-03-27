public class MainFuncionarios {
    public static void main(String[] args) {

        Funcionarios funcionario = new Funcionarios("Regina", 15.000f) {
            @Override
            public double calcularSalario() {
                return getSalarioBase();
            }
        };

        Gerente gerente = new Gerente("João", 10.000f, 1.000f);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ingrid", 11.000f);

        System.out.println("Dados do funcionario");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Base: " + funcionario.getSalarioBase());
        System.out.println("Salário Calculado: " + funcionario.calcularSalario());
        System.out.println();

        System.out.println("Dados do gerente");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário Base: " + gerente.getSalarioBase());
        System.out.println("Bônus: " + gerente.getBonus());
        System.out.println("Salário Calculado: " + gerente.calcularSalario());
        System.out.println();

        System.out.println("Dados do Desenvolvedor");
        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário Base: " + desenvolvedor.getSalarioBase());
        System.out.println("Salário Calculado: " + desenvolvedor.calcularSalario());
        System.out.println();
    }
}
