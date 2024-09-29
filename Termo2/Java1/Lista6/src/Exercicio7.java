import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length;
		
		System.out.printf("Digite uma frase:\n-> ");
		String name = scanner.nextLine();
		
		length = name.length();
		
		System.out.printf("-> ");
		
		for (int i=length-1; i>-1; i--) {
			System.out.printf("%s", name.charAt(i));
		}

		scanner.close();
	}
}
