import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random gerador = new Random();
		int i, j, linha = 2, coluna = 3, total = 0;
		int A[][] = new int [linha][coluna];
		
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				A[i][j] = gerador.nextInt(10);
			}
		}
		
		System.out.printf("Matriz A:\n");
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				System.out.printf("%d ", A[i][j]);
				total += A[i][j];
			}
			System.out.println();
		}
		System.out.printf("A soma dos elementos da Matriz A é %d.", total);
	}
}
