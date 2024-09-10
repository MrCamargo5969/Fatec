import java.util.Scanner;

public class Exercicios8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double day;
        System.out.println("Quantos dias com o carro?: ");
        day = scanner.nextFloat();
        
        double km;
        System.out.println("Quantos quilometros percorridos?: ");
        km = scanner.nextFloat();
        
        double custo_aluguel = (km*0.15)+(day*60);
       
        
        
        System.out.printf("O custo do aluguel do carro por %.1f dias e percorrido por %.1f quilometros ficou %.2f",day, km ,custo_aluguel);
        
        scanner.close();
	}
}
