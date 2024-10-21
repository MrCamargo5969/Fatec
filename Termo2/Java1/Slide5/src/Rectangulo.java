import java.util.Scanner;
public class Rectangulo {
    public int base;
    public int altura;
    public int perimetro;
    public int area;

    public Rectangulo(int b, int h){
        base = b;
        altura = h;
    }
    public Rectangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a base:\n-> ");
        base = scanner.nextInt();

        System.out.printf("Digite a altura:\n-> ");
        altura = scanner.nextInt();

        scanner.close();
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
