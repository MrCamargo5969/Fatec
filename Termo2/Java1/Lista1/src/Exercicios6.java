import java.util.Scanner;

public class Exercicios6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salario;
        System.out.println("Digite seu salario: ");
        salario = scanner.nextFloat();
        
        double reajuste;
        System.out.println("Digite o reajuste anual: ");
        reajuste = scanner.nextFloat();
        
        double reajustado = (salario*reajuste)/100+salario;
        
        System.out.print("O reajuste do salario de " + salario + " em " + reajuste +"% é igual a " + reajustado);
        
        scanner.close();
	}
}
