import java.util.Scanner;

public class exercicios13_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.printf("Escolha um numero:\n");
		int number = scanner.nextInt(), val = 0;
		for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
            	val += 1;
            };
        };
        if (val == 2) {System.out.printf("O numero %d é primo.\n", number);}
        else System.out.printf("O numero %d NÃO é primo.\n", number);
        
        
		System.out.printf("Deseja continuar? [s] [n]\n");
		scanner.nextLine();
		String resp = scanner.nextLine();
		if (!resp.equalsIgnoreCase("s")) {break;}
		
	}
	
    scanner.close();
	}
}
