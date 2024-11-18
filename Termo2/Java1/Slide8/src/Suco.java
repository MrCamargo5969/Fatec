public class Suco extends Bebida {
    private String sabor;
    public Suco(String sabor) {
        super();
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void mostraBebida() {
        System.out.println("Nome: " + getName());
        System.out.println("Preço: " + getPrice());
        System.out.println("Sabor: " + sabor);
    }
}
