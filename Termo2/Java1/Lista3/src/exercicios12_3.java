import java.util.Scanner;

public class exercicios12_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value;
		while (true) {
			System.out.printf("Quer fatoriar qual numero?: ");
			int number = scanner.nextInt();
			
			long fatorial = 1;
	        for (int i = 1; i <= number; i++) {
	            fatorial *= i;
	        }
			System.out.printf("%d! = %d.\n",number, fatorial );
			
			
			System.out.printf("Deseja continuar? [s] [n]\n");
			scanner.nextLine();
			String resp = scanner.nextLine();
			if (!resp.equalsIgnoreCase("s")) {break;}
			
		}
		
        scanner.close();
	}
	
}
