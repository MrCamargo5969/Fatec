import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int i, par = 0, numbers = 0, vetor[] = new int [20];
		
		for (i=0; i<20; i++) {
			vetor[i] = generator.nextInt(49) + 1;
		};
		
		for (i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
			if (vetor[i]%2 == 0) {
				par = par+vetor[i];
				numbers++;
			}
		};
		double result = par/numbers;
		System.out.printf("A média dos pares no vetor é %.2f%n", result);
	}
}