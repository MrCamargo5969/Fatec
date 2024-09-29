import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite um nome:\n-> ");
		String name = scanner.nextLine();
		
		for (int i=0; i<10; i++) {
			System.out.printf("%02d Nome: %s.%n",i+1, name);
		}
		scanner.close();
	}
}
