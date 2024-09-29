import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name_;
		int length;
		
		System.out.printf("Digite um nome:\n-> ");
		String name = scanner.nextLine();
		
		name_ = name.replaceAll("\\s", "");
		
		length = name_.length();
		
		System.out.printf("-> ");
		
		for (int i=0; i<length; i++) {
			if ((i+1)%2 == 0) {
				System.out.printf(" %s", name_.charAt(i));
			}
		}
		System.out.printf("\n");
		scanner.close();
	}
}
