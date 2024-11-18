public class Quadrado {
    protected double width;
    protected double length;

    public Quadrado(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }

    public double area(){
        return width * length;
    }

    public double perimeter(){
        return 2*length + 2*width;
    }

    public void print(){
        System.out.printf("Largura: %f\nComprimento: %f\nÁrea: %f\nPerimetro: %f\n", width, length, area(), perimeter());
    }
}
