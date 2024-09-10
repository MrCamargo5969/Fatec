import java.util.Scanner;

public class exercicios3_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um nome:");
        String name = scanner.next();
		int i = 0;
		for (i = 0; i < 10; i ++)
        	System.out.println(name);
		scanner.close();
	}
}
