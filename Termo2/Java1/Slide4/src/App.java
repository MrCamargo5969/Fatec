public class App {
    public static void main(String[] args) throws Exception {
        int base = 5, altura = 5;
        
        Retangulo rec1 = new Retangulo(base, altura);

        System.out.println("Base do retângulo: " + rec1.base());
        System.out.println("Altura do retângulo: " + rec1.altura());
        rec1.exibeArea();
        rec1.exibePerimetro();
    }
}
