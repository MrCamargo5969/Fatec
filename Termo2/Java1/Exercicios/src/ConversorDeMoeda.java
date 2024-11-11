public class ConversorDeMoeda {
    private static final double TAXA_DOLAR_PARA_REAL = 5.25;
    private static final double TAXA_EURO_PARA_REAL = 5.85;
    private static final double TAXA_REAL_PARA_DOLAR = 1 / TAXA_DOLAR_PARA_REAL;
    private static final double TAXA_REAL_PARA_EURO = 1 / TAXA_EURO_PARA_REAL;

    public static double realParaDolar(double valorEmReal) {
        return valorEmReal * TAXA_REAL_PARA_DOLAR;
    }

    public static double realParaEuro(double valorEmReal) {
        return valorEmReal * TAXA_REAL_PARA_EURO;
    }

    public static double dolarParaReal(double valorEmDolar) {
        return valorEmDolar * TAXA_DOLAR_PARA_REAL;
    }

    public static double euroParaReal(double valorEmEuro) {
        return valorEmEuro * TAXA_EURO_PARA_REAL;
    }

    public static double dolarParaEuro(double valorEmDolar) {
        double valorEmReal = dolarParaReal(valorEmDolar);
        return realParaEuro(valorEmReal);
    }

    public static double euroParaDolar(double valorEmEuro) {
        double valorEmReal = euroParaReal(valorEmEuro);
        return realParaDolar(valorEmReal);
    }
}
