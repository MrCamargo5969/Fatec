import java.util.Scanner;

public class exercicios14_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0, total = 1;
		while (true) {
			System.out.printf("Digite um numero: ");
			number = scanner.nextInt();
			while (total < number) {
				if (total%2 != 0) {
				}
				total += 1;
			}
			if (total == number) {
				System.out.printf("O numero %d é um quadrado perfeito.\n", number);
			}
			else{System.out.printf("O numero %d NÃO é um quadrado perfeito.\n", number);};
			
			System.out.printf("Deseja continuar? [s] [n]\n");
			scanner.nextLine();
			String resp = scanner.nextLine();
			if (!resp.equalsIgnoreCase("s")) {break;}
			
		}
		
	    scanner.close();
	}
}
