public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataFormato1() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    public String getDataFormato2() {
        return String.format("%02d-%02d-%d", mes, dia, ano);
    }

    public void exibirFormatos() {
        System.out.println("Formato dd/mm/yyyy: " + getDataFormato1());
        System.out.println("Formato mm-dd-yyyy: " + getDataFormato2());
    }
}
