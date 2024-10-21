public class App {
    public static void main(String[] args) throws Exception {
        int base = 5, altura = 5;
        
        Rectangulo rec1 = new Rectangulo(6, 4);
        Rectangulo rec2 = new Rectangulo();

        System.out.printf("Dados do retangulo 1:\n");
        System.out.println("Base: " + rec1.base());
        System.out.println("Altura: " + rec1.altura());
        rec1.exibeArea();
        rec1.exibePerimetro();

        System.out.printf("\nDados do retangulo 2:\n");
        System.out.println("Base: " + rec2.base());
        System.out.println("Altura: " + rec2.altura());
        rec2.exibeArea();
        rec2.exibePerimetro();
    }
}
