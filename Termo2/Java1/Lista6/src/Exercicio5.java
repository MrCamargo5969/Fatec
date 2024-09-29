import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> lista = Arrays.asList("a","e","i","o","u");
		
		String name_;
		int length, total = 0;
		
		System.out.printf("Digite uma frase:\n-> ");
		String name = scanner.nextLine();
		
		name_ = name.replaceAll("\\s", "").toLowerCase();
		length = name_.length();
		
		for (int i=0; i<length; i++) {
			String caractere = String.valueOf(name_.charAt(i));
			if (lista.contains(caractere)) {
				total++;
			}
		}
		System.out.printf("\n");
		System.out.printf("Existem %02d vogais nessa frase.", total);
		scanner.close();
	}
}
