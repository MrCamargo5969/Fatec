public class Vinho extends Bebida {
    private int safra;
    public Vinho(int safra) {
        super();
        this.safra = safra;
    }
    public int getSafra() {
        return safra;
    }
    public void setSafra(int safra) {
        this.safra = safra;
    }

    @Override
    public void mostraBebida() {
        System.out.println("Nome: " + getName());
        System.out.println("Preço: " + getPrice());
        System.out.println("Safra: " + safra);
    }
}
