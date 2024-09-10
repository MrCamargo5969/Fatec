import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
	        int number1;
	        System.out.println("Digite um valor: ");
	        number1 = scanner.nextInt();
	        
	        int number2;
	        System.out.println("Digite um valor: ");
	        number2 = scanner.nextInt();
	        
	        int result = number1 + number2;
	        
	        System.out.printf("%d + %d = %d", number1, number2, result);
	        
	        scanner.close();
    }        
}