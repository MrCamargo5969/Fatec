import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numberOne = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;
        System.out.println("A soma dos dois numeros e: " + sum);
        
        scanner.close();
    }
}