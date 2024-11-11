public class Segredo {
    private String informacaoSecreta;

    public Segredo(String informacaoSecreta) {
        this.informacaoSecreta = informacaoSecreta;
    }

    public String acessarInformacaoSecreta() {
        return informacaoSecreta;
    }

    public void alterarInformacaoSecreta(String novaInformacao) {
        this.informacaoSecreta = novaInformacao;
    }
}
