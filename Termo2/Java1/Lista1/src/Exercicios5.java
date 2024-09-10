import java.util.Scanner;

public class Exercicios5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a;
        System.out.println("Digite um valor: ");
        a = scanner.nextInt();
        
        int b;
        System.out.println("Digite um valor: ");
        b = scanner.nextInt();
        
        int c;
        
        System.out.printf("A = %d\n", a);
        System.out.printf("B = %d\n", b);
        System.out.printf("reverse\n");
        
        c = a;
        a = b;
        b = c;
        
        System.out.printf("A = %d\n", a);
        System.out.printf("B = %d\n", b);
        
        scanner.close();
	}
}
