public class Refrigerante extends Bebida {
    private boolean retornavel;

    public Refrigerante(boolean retornavel) {
        super();
        this.retornavel = retornavel;
    }
    public boolean isRetornavel() {
        return retornavel;
    }
    public void setRetornavel(boolean retornavel) {
        this.retornavel = retornavel;
    }

    @Override
    public void mostraBebida() {
        System.out.println("Nome: " + getName());
        System.out.println("Preço: " + getPrice());
        System.out.println("Retornável: " + (retornavel ? "Sim" : "Não"));
    }
}
