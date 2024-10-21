public class Retangulo {
    public int base;
    public int altura;
    public int perimetro;
    public int area;

    public Retangulo(int b, int h){
        base = b;
        altura = h;
    }

    public int base(){
        return base;
    }
    
    public int altura(){
        return altura;
    }

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return (2*base) + (2*altura);
    }

    public void exibeArea(){
        System.out.println("Área do retângulo: " + area());
    }

    public void exibePerimetro(){
        System.out.println("Perimetro do retângulo: " + perimetro());
    }
}
