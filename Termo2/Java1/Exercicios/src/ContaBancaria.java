import java.text.NumberFormat;
import java.util.Locale;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirSaldoFormatado() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Saldo: " + formatoMoeda.format(saldo));
    }
}