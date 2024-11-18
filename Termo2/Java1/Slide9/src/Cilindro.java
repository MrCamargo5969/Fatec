public class Cilindro extends Circulo{
    private double high;

    public Cilindro(double ray, double high) {
        super(ray);
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
        System.out.printf("Raio: %f\nÁrea: %f\nVolume: %f\n", getRay(), area(), volume());
    }
}
