import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		Random gerador = new Random();
		int i, j, linha = 10, coluna = 10, menor = 50, x = 0, y = 0;
		int A[][] = new int [linha][coluna];
		
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				A[i][j] = gerador.nextInt(49)+1;
			}
		}
		
		System.out.printf("Matriz A:\n");
		for (i=0; i<linha; i++) {
			for (j=0; j<coluna; j++) {
				System.out.printf("%d ", A[i][j]);
				if (A[i][j]<menor) {
					menor = A[i][j];
					x = i;
					y = j;
				};
			}
			System.out.println();
		}
		System.out.printf("A menor elemento da Matriz A é %d e fica em A[%d][%d].", menor,x+1,y+1);
	}
}
