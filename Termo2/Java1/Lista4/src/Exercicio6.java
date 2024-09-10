import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int i, vetorA[] = new int [10], vetorB[] = new int [vetorA.length];
		
		for (i=0; i<vetorA.length; i++) {
			vetorA[i] = generator.nextInt(49) + 1;
		};
		System.out.printf("\nVetor A:\n");
		for (i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		};
		
		System.out.printf("\nQual multiplicador?\n-> ");
		int number = scanner.nextInt();
		
		for (i=0; i<vetorB.length; i++) {
			vetorB[i] = vetorA[i] * number;
		};
		System.out.printf("\nVetor B:\n");
		for (i=0; i<vetorB.length; i++) {
			System.out.println(vetorB[i]);
		};
		scanner.close();
	}
}

