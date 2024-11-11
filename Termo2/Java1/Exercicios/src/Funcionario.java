public class Funcionario {
    public String nome;
    public double salario;

    public static double salarioBase;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularSalarioTotal() {
        return salario + salarioBase;
    }
}
