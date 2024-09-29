import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length;
		
		System.out.printf("Digite um nome:\n-> ");
		String name = scanner.nextLine();
		
		length = name.replaceAll("\\s", "").length();
		
		for (int i=0; i<length; i++) {
			System.out.printf("%02d Nome: %s.%n",i+1, name);
		}
		scanner.close();
	}
}
