import java.util.Random;

public class Exercicio6 {
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
			}
			System.out.println();
		}
		System.out.println();
		for (j=0; j<coluna; j++) {
			for (i=0; i<linha; i++) {
				total += A[i][j];
			}
			System.out.printf("Soma da coluna %d = %d\n", j, total);
			total = 0;
		}
	}
}


