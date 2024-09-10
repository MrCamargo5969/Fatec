import java.util.Scanner;

public class exercicios6_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ano;
        System.out.printf("Digite um ano:\n");
        ano = scanner.nextInt();
        if (ano%4 == 0 || ano%400 == 0 && ano%100 != 0) {System.out.printf("O ano %d é bisexto", ano);}
        else {System.out.printf("O ano %d não é bisexto", ano);}
        
        
        scanner.close();  
	}
}