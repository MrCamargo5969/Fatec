import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite um caractere:\n-> ");
		String carac = scanner.nextLine();
		List<String> lista = Arrays.asList(carac.toLowerCase(), carac.toUpperCase());
		
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
		System.out.printf("Existem %02d caracteres \"%s\" nessa frase.", total, carac.toLowerCase());
		scanner.close();
	}
}
