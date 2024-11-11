import java.util.Date;

public class Evento {
    private String nome;
    private Date data;
    private String local;

    public Evento(String nome, Date data) {
        this.nome = nome;
        this.data = data;
        this.local = "Não especificado";
    }

    public Evento(String nome, Date data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void exibirInformacoes() {
        System.out.println("Evento: " + nome);
        System.out.println("Data: " + data.toString());
        System.out.println("Local: " + local);
    }
}
