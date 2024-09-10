import java.util.Scanner;

public class exercicios7_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        int auxiliar;
        System.out.printf("Digite um numero:\n");
        number1 = scanner.nextInt();
        
        System.out.printf("Digite outro numero:\n");
        number2 = scanner.nextInt();
        
        System.out.print("Digite o ultimo numero:\n");
        number3 = scanner.nextInt();
        
        if (number1 > number2) {auxiliar = number2; number2 = number1; number1 = auxiliar;};
        if (number2 > number3) {auxiliar = number3; number3 = number2; number2 = auxiliar;};
        if (number1 > number2) {auxiliar = number2; number2 = number1; number1 = auxiliar;};
        System.out.printf("%d < %d < %d", number1, number2, number3);
        
        
        scanner.close();  
	}
}
