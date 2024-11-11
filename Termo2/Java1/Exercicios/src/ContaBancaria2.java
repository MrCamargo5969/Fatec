import java.util.ArrayList;
import java.util.List;

public class ContaBancaria2 {
    private String titular;
    private double saldo;
    private List<String> historicoTransacoes;

    public ContaBancaria2(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historicoTransacoes = new ArrayList<>();
        historicoTransacoes.add("Saldo inicial: R$ " + saldoInicial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add("Depósito de R$ " + valor);
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historicoTransacoes.add("Saque de R$ " + valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void exibirHistorico() {
        System.out.println("Histórico de transações da conta de " + titular + ":");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
