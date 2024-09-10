import java.util.Scanner;

public class exercicios6_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int i = 0, par = 0, impar = 0;
        System.out.print("Quantos numeros quer digitar?: ");
        int quant = scanner.nextInt();
		while (i != quant) {
			System.out.print("Digite um numero: ");
			int number = scanner.nextInt();
			if (number%2 == 0) {
        	par += number;
			}else {impar += number;}
        	i += 1;
        	}
		scanner.close();
		System.out.printf("A soma dos pares é %d.\nA soma dos impares é %d", par, impar);
	}
	
}