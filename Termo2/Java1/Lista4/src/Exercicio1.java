import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int i, par = 0, impar = 0, vetor[] = new int [10];
		
		for (i=0; i<10; i++) {
			vetor[i] = generator.nextInt(49) + 1;
		};
		
		for (i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
			if (vetor[i]%2 == 0) {
				par++;
			} else{
				impar++;
			};
		};
		System.out.printf("O total de numeros pares no vetor é %d.\nO total de impares no vetor é %d.\n", par, impar);
	}
}