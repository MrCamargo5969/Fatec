import java.util.Scanner;

public class Exercicios2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1;
        System.out.println("Digite um valor: ");
        number1 = scanner.nextInt();
        
        int number2;
        System.out.println("Digite um valor: ");
        number2 = scanner.nextInt();
        
        int number3;
        System.out.println("Digite um valor: ");
        number3 = scanner.nextInt();
        
        int result = (number1 + number2 + number3)/2;
        
        System.out.printf("A média de %d, %d e %d é %d", number1, number2, number3, result);
        
        scanner.close();
	}
}
