import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {
		Random generator = new Random();
		
		int i, vetorA[] = new int [10];
		
		for (i=0; i<vetorA.length; i++) {
			vetorA[i] = generator.nextInt(49) + 1;
		};
		System.out.printf("\nVetor A:\n");
		for (i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		};
		
		for (i = 0; i < vetorA.length - 1; i++) {
            for (int j = 0; j < vetorA.length - i - 1; j++) {
                if (vetorA[j] > vetorA[j + 1]) {
                    int temp = vetorA[j];
                    vetorA[j] = vetorA[j + 1];
                    vetorA[j + 1] = temp;
                }
            }
        }
		System.out.printf("\nOrdenada:\n");
		for (i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		};
	}
}

