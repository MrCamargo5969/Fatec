import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int i, j, linha = 10, coluna = 10, number = 00, multiply = 00;
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
		
		//Escolher Coluna
		System.out.printf("Qual coluna quer imprimir?(Escolha de 0 a %d)\n", coluna-1);
		number = scanner.nextInt();
		
		System.out.printf("Qual multiplucador?\n");
		multiply = scanner.nextInt();
		
		if (number < coluna && number >= 0) {
			for (i=0; i<linha; i++) {
				A[i][number] = A[i][number] * multiply;
			}
		}
		else System.err.println("Erro: Algo deu errado!");
		
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
