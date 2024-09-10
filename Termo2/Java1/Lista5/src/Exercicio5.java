import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int i, j, linha = 10, coluna = 10, total = 0;
		int A[][] = new int [linha][coluna];
		
		//Gerar matriz
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				A[i][j] = gerador.nextInt(49)+1;
			}
		}
		
		//Imprimir Matriz
		System.out.printf("Matriz A:\n");
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				System.out.printf("%d ", A[i][j]);
				total += A[i][j];
			}
			System.out.printf(": Total = %d\n", total);
			total = 0;
		}
	}
}


