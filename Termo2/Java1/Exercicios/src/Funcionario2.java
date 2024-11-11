public class Funcionario2 {
    private String nome;
    private double salario;

    public Funcionario2(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void darAumento(double porcentagem) {
        double limitePorcentagem = 16.6;
        
        if (porcentagem > limitePorcentagem) {
            System.out.println("Aumento máximo permitido é de " + limitePorcentagem + "%.");
            return;
        }
        
        double aumento = salario * porcentagem / 100;
        salario += aumento;
        System.out.println("Aumento de " + porcentagem + "% concedido. Novo salário: R$ " + salario);
    }

    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário atual: R$ " + salario);
    }
} 
