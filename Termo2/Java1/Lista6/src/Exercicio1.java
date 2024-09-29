import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length;
		
		System.out.printf("Digite um nome:\n-> ");
		String name = scanner.nextLine();
		
		length = name.replaceAll("\\s", "").length();
		
		System.out.printf("O nome %s tem um total de %d letras.", name, length);
		
		scanner.close();
	}
}
