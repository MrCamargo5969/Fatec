import java.util.Scanner;

public class exercicios1_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 0 a 999:");
        int number = scanner.nextInt();
        if (99 < number && number < 1000) {
        	int three = number % 10;
        	int oneTwo = number / 10;
        	int two = oneTwo % 10;
        	int one = oneTwo / 10;
        	
        	if (one < two && two < three) {
        		System.out.printf("%d é Ascendente", number);
        	} else {System.out.printf("%d não é Ascendente", number);};
        	
        }
        scanner.close();
	}
}
