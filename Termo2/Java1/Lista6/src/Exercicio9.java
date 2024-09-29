import java.util.Scanner;
import java.util.Arrays;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String vetor[] = new String[5];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.printf("Digite um nome:\n-> ");
			String name = scanner.nextLine();
			vetor[i] = name;
		}
		
		Arrays.sort(vetor);
		
		for (int i=0; i<vetor.length; i++) {
			System.out.printf("%s\n",vetor[i]);
		}
		scanner.close();
	}
}
