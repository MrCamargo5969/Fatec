import java.util.Scanner;

public class exercicios10_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0, value1b = 0, value2b = 0;
		while (true) {
			System.out.printf("Digite o primeiro valor: ");
			int value1 = scanner.nextInt();
			System.out.printf("Digite o segundo valor: ");
			int value2 = scanner.nextInt();
			if (value2 > value1) {
				value2b = value2;
				value1b = value1;
				while (value2b != value1b-1) {
					total += value2b;
					value2b -= 1;
				}
			}
			else break;
			System.out.printf("A soma entre os numeros %d e %d é igual a %d.\n", value1, value2, total);
			System.out.printf("Deseja continuar? [s] [n]\n");
			scanner.nextLine();
			String resp = scanner.nextLine();
			if (!resp.equalsIgnoreCase("s")) {break;}
			
		}
		
        scanner.close();
	}
	
}