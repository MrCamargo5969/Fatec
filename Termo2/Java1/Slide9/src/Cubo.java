public class Cubo extends Quadrado{
    private double high;

    public Cubo(double width, double length, double high) {
        super(width, length);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double area(){
        double lateral = high * super.perimeter();
        double base = 2 * super.area();
        return lateral + base;
    }

    public double volume(){
        return super.area() * high;
    }

    public void print(){
        System.out.printf("Largura: %f\nComprimento: %f\nAltura: %f\nÁrea: %f\nVolume: %f\n", getWidth(), getLength(), high, area(), volume());
    }
}
