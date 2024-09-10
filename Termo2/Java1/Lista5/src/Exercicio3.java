import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
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
		
		//Escolher linha
		System.out.printf("Qual linha quer imprimir?(Escolha de 0 a 6)\n");
		number = scanner.nextInt();
		if (number <= 6 && number >= 0) {
			System.out.printf("Linha escolhida: %d\n", number);
			for (j=0; j<coluna; j++) {
				System.out.printf("%d ", A[number][j]);
			}
		}
		else System.err.println("Erro: Algo deu errado!");

	}
}
