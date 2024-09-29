import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length;
		
		System.out.printf("Digite uma frase:\n-> ");
		String name = scanner.nextLine();
		
		length = name.length();
		
		System.out.printf("Caractere(s) do meio: ");
		
		if (length%2 == 1) {
			System.out.printf("%s", name.charAt(length/2));
		}
		else {
			System.out.printf("%s%s", name.charAt((length-1)/2), name.charAt(length/2));
		}

		scanner.close();
	}
}
