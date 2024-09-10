import java.util.Random;

public class Exercicio8 {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int i, par = 0, impar = 0, vetorA[] = new int [10];
		
		for (i=0; i<vetorA.length; i++) {
			vetorA[i] = generator.nextInt(49) + 1;
		};
		
		System.out.printf("Vetor A:\n");
		for (i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
			if (vetorA[i]%2 == 0) {
				par++;
			} else{
				impar++;
			};
		};
		int vetorB[] = new int [par], vetorC[] = new int [impar];
		
		for (i=0; i<vetorB.length; i++) {
			for (int j=i;j<vetorA.length; j++)
				if (vetorA[j]%2 == 0) {
					 vetorB[i] = vetorA[j];
					 i++;
				}
		};
		for (i=0; i<vetorC.length; i++) {
			for (int j=i;j<vetorA.length; j++)
				if (vetorA[j]%2 != 0) {
					 vetorC[i] = vetorA[j];
					 i++;
				}
		};
		System.out.printf("\nVetor B:\n");
		for (i=0; i<vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
		System.out.printf("\nVetor C:\n");
		for (i=0; i<vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}
	}
}