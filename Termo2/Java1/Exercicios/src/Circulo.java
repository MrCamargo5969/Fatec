public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public void exibirRaio() {
        System.out.println("Raio do círculo: " + raio);
    }
}
