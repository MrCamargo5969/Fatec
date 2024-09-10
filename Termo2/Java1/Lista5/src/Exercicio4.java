import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int i, j, linha = 7, coluna = 4, number = 00;
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
		
		//Escolher Coluna
		System.out.printf("Qual coluna quer imprimir?(Escolha de 0 a 3)\n");
		number = scanner.nextInt();
		if (number <= 3 && number >= 0) {
			System.out.printf("Linha escolhida: %d\n", number);
			for (i=0; i<linha; i++) {
				System.out.printf("%d\n", A[i][number]);
			}
		}
		else System.err.println("Erro: Algo deu errado!");

	}
}

