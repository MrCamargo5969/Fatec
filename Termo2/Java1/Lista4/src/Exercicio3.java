import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int i, vetor[] = new int [20];
		
		for (i=0; i<20; i++) {
			vetor[i] = generator.nextInt(49) + 1;
		};
		
		for (i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		};
		
		System.out.printf("\nMultiplos de 5:\n");
		for (i=0; i<vetor.length; i++) {
			if (vetor[i]%5 == 0) {
				System.out.println(vetor[i]);
			}
		};
	}
}
