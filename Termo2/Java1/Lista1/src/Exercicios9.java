import java.util.Scanner;

public class Exercicios9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double fahrenheit;
        System.out.println("Quantos graus Fº?: ");
        fahrenheit = scanner.nextFloat();
        
        double celsius = ((fahrenheit - 32)/9)*5;
        System.out.printf("%.1fºF equivale a %.1fºC", fahrenheit, celsius);
        
        scanner.close();
	}
}
