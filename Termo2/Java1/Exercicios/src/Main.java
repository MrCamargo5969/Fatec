public class Main {
    public static void main(String[] args) {
        double valorEmReal = 100.0;
        double valorEmDolar = 50.0;
        double valorEmEuro = 30.0;

        // Real para Dólar
        double convertidoParaDolar = ConversorDeMoeda.realParaDolar(valorEmReal);
        System.out.println(valorEmReal + " BRL = " + convertidoParaDolar + " USD");

        // Real para Euro
        double convertidoParaEuro = ConversorDeMoeda.realParaEuro(valorEmReal);
        System.out.println(valorEmReal + " BRL = " + convertidoParaEuro + " EUR");

        // Dólar para Real
        double convertidoParaRealDeDolar = ConversorDeMoeda.dolarParaReal(valorEmDolar);
        System.out.println(valorEmDolar + " USD = " + convertidoParaRealDeDolar + " BRL");

        // Euro para Real
        double convertidoParaRealDeEuro = ConversorDeMoeda.euroParaReal(valorEmEuro);
        System.out.println(valorEmEuro + " EUR = " + convertidoParaRealDeEuro + " BRL");

        // Dólar para Euro
        double convertidoParaEuroDeDolar = ConversorDeMoeda.dolarParaEuro(valorEmDolar);
        System.out.println(valorEmDolar + " USD = " + convertidoParaEuroDeDolar + " EUR");

        // Euro para Dólar
        double convertidoParaDolarDeEuro = ConversorDeMoeda.euroParaDolar(valorEmEuro);
        System.out.println(valorEmEuro + " EUR = " + convertidoParaDolarDeEuro + " USD");
    }
}
