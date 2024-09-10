import java.util.Scanner;

public class Exercicios3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int metro;
        System.out.println("Digite um valor: ");
        metro = scanner.nextInt();
        
        int milimitro = metro*1000;
        
        System.out.printf("%d metros equivale a %d milimitros", metro, milimitro);
        
        scanner.close();
	}
}

