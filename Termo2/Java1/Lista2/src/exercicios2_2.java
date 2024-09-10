import java.util.Scanner;

public class exercicios2_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma placa(4 digitos):");
        String plate = scanner.next();
        char lastNumber = plate.charAt(3);
        switch (lastNumber) {
        case '3': System.out.print("Carro de Terça-feira"); break;
        case '4': System.out.print("Carro de Terça-feira"); break;
        case '5': System.out.print("Carro de Quarta-feira"); break;
        case '6': System.out.print("Carro de Quarta-feira"); break;
        case '7': System.out.print("Carro de Quinta-feira"); break;
        case '8': System.out.print("Carro de Quinta-feira"); break;
        case '9': System.out.print("Carro de Sexta-feira"); break;
        case '0': System.out.print("Carro de Sexta-feira"); break;
        default: System.out.print("Carro de Ssegunda-feira"); break;
        	
        }
        scanner.close();
	}
}