import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contator = 100;
        while (contator > 0) {
	        int number1;
	        System.out.println("Digite um valor: ");
	        number1 = scanner.nextInt();
	        
	        String operator;
	        scanner.nextLine();
	        System.out.println("Escolha [+] [-][*] [/] [%]: ");
	        operator = scanner.nextLine();
	        
	        scanner.nextInt();
	        int number2;
	        System.out.println("Digite um valor: ");
	        number2 = scanner.nextInt();
	        
	        
	        if (operator == ("+")) {
	        	int result = number1 + number2;
	        	System.out.printf("%d %s %d = %d", number1, operator, number2, result);
	        } else if (operator == "-") {
	        	int result = number1 - number2;
	        	System.out.printf("%d %s %d = %d", number1, operator, number2, result);
	        } else if (operator == "*") {
	        	int result = number1 * number2;
	        	System.out.printf("%d %s %d = %d", number1, operator, number2, result);
	        } else if (operator == "/") {
	        	int result = number1 / number2;
	        	System.out.printf("%d %s %d = %d", number1, operator, number2, result);
	        } else if (operator == "%") {
	        	int result = number1 % number2;
	        	System.out.printf("%d %s %d = %d", number1, operator, number2, result);
	        } else { contator = 0;
	        	}
	        }
        scanner.close();
        
    }
}