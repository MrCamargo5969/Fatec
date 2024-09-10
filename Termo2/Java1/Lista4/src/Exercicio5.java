import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int i, vetor[] = new int [10];
		
		for (i=0; i<vetor.length; i++) {
			vetor[i] = generator.nextInt(49) + 1;
		};
		
		for (i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		};
		
		System.out.printf("\nReverse:\n");
		for (i=0; i<vetor.length; i++) {
			System.out.println(vetor[(vetor.length-1)-i]);
		};
	}
}

