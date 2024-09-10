import java.util.Scanner;

public class Exercicios7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double preco;
        System.out.println("Preço do litro do Combustivel: ");
        preco = scanner.nextFloat();
        
        double kml;
        System.out.println("Qual o desempenho do carro: ");
        kml = scanner.nextFloat();
        
        double km;
        System.out.println("Qual a distância entre a cidade A e a cidade B?: ");
        km = scanner.nextFloat();
        
        double litros_gastos = km/kml;
        
        double dinheiro = litros_gastos*preco;
        
        
        System.out.printf("Para essa viagem de %.2fKm, vamos gastar R$%.2f e %.2f litros de combustivel",km ,dinheiro, litros_gastos);
        
        scanner.close();
	}
}
