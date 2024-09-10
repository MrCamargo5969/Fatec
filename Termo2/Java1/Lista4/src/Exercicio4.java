import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int i, vetor[] = new int [20];
		
		for (i=0; i<20; i++) {
			vetor[i] = generator.nextInt(49) + 1;
		};
		
		for (i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		};
		System.out.printf("\nMultiplos de qual numero?\n->");
		int number = scanner.nextInt();
		System.out.printf("\nMultiplos de %d:\n", number);
		for (i=0; i<vetor.length; i++) {
			if (vetor[i]%number == 0) {
				System.out.println(vetor[i]);
			}
		};
		scanner.close();
	}
}
