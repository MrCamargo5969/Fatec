import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int i, number, vetorA[] = new int [10];
		
		for (i=0; i<vetorA.length; i++) {
			vetorA[i] = generator.nextInt(49)+1;
		}
		System.out.printf("Digite um numero\n->");
		number = scanner.nextInt();
		
		
		System.out.printf("Vetor A:\n");
		for (i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		};
		
		for (i=0; i<vetorA.length; i++) {
			if (vetorA[i] == number) {
				System.out.printf("O numero %d está no vetor A.", number);
				System.exit(0);
			}
		};
		System.out.printf("O numero %d NÃO está no vetor A.", number);
		scanner.close();
	}
}