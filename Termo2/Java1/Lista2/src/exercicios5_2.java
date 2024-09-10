import java.util.Scanner;

public class exercicios5_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angulo1, angulo2, angulo3;
        System.out.printf("Digite um angulo:\n");
        angulo1 = scanner.nextInt();
        
        System.out.printf("Digite outro angulo:\n");
        angulo2 = scanner.nextInt();
        
        System.out.print("Digite o ultimo angulo:\n");
        angulo3 = scanner.nextInt();
        
        int anguloTotal = angulo1 + angulo2 + angulo3;
        if (angulo1 != 0 && angulo2 != 0 && angulo3 != 0 && anguloTotal == 180) {
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {System.out.printf("Triangulo retângulo");}
        else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {System.out.printf("Triangulo Obtusângulo");}
        else {System.out.printf("Triangulo Acutângulo");}
        } else {System.out.printf("Triangulo Invalido");}
        
        scanner.close();  
	}
}