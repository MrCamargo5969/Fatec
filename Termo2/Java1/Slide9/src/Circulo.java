public class Circulo{
    private double ray;

    public Circulo(double ray) {
        this.ray = ray;
    }

    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }

    public double area(){
        return Math.PI * Math.pow(ray, 2);
    }

    public double perimeter(){
        return Math.PI * ray * 2;
    }

    public void print(){
        System.out.printf("Raio: %f\nÁrea: %f\nPerimetro: %f\n", ray, area(), perimeter());
    }
}
