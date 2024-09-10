import java.util.Random;

public class Exercicio9 {
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int i, j, linha = 10, coluna = 10, aux = 0;
		int A[][] = new int [linha][coluna];
		
		//Gerar matriz
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				A[i][j] = gerador.nextInt(99);
			}
		}
		
		//Imprimir Matriz
		System.out.printf("Matriz A:\n");
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				System.out.printf("%d ", A[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (i=0; i<linha; i++) {
			j = i;
			aux = A[i][j];
			A[i][j] = A[i][(coluna-1)-j];
			A[i][(coluna-1)-j] = aux;
		}
		
		System.out.printf("Matriz B:\n");
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				System.out.printf("%d ", A[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}
}
