public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$ " + saldo);
    }
}
