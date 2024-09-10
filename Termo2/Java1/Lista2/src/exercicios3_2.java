import java.util.Scanner;

public class exercicios3_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alt, base, op;
        System.out.printf("Digite uma altura:\n");
        alt = scanner.nextInt();
        
        System.out.printf("Digite uma base: ");
        base = scanner.nextInt();
        
        System.out.print("\nÉ um Retangulo[1] ou Triangulo[2]: ");
        op = scanner.nextInt();
        if (op > 2 || op < 1) {System.out.print("Invalido"); System.exit(1);}
        
        if (op == 1) {int area = alt*base; System.out.printf("Área do retangulo igual %d metros", area);
        }else if (op == 2) {int area = (alt*base)/2; System.out.printf("Área do triangulo igual %d metros", area);}
        
        scanner.close();
        
        
        
	}
}
