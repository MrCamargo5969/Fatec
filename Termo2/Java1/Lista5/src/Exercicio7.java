import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int i, j, linha = 10, coluna = 10, number = 00;
		int A[][] = new int [linha][coluna];
		int B[] = new int [linha];
		
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
		//Escolher linha
		System.out.printf("Qual linha base para o Vetor B?(Escolha de 0 a 9)\n");
		number = scanner.nextInt();
		if (number < linha && number >= 0) {
			for (j=0; j<coluna; j++) {
				B[j] = A[number][j];
			}
			System.out.println();
			System.out.printf("Vetor B:\n");
			for (j=0; j<linha; j++) {
				System.out.printf("%d ", B[j]);
			}
		}
		else System.err.println("Erro: Algo deu errado!");

	}
}
