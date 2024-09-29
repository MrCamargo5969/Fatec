import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite um nome:\n-> ");
		String word1 = scanner.nextLine();
		
		String word = word1.replaceAll("\\s", "").toLowerCase();
		
		int inicio=0, fim=word.length();
		
		System.out.println();
		
		while (inicio < fim) {
			if (word.charAt(inicio) != word.charAt(fim-1)) {
				System.out.printf("A palavra %s NÃO é palíndrome.", word1);
		        System.exit(0);
            }
			inicio++;
			fim--;
		}
		System.out.printf("A palavra %s é palíndrome.", word1);
		scanner.close();
	}
}
