import java.util.Scanner;

public class Exercicios4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int day;
        System.out.println("Digite os dias: ");
        day = scanner.nextInt();
        
        int hour;
        System.out.println("Digite as horas: ");
        hour = scanner.nextInt();
        
        int minute;
        System.out.println("Digite os minutos: ");
        minute = scanner.nextInt();
        
        int second;
        System.out.println("Digite os segundos: ");
        second = scanner.nextInt();
        
        int second_in_day = second+(minute*60)+(hour*60*60)+(day*60*60*24);
        
        System.out.printf("Existem tantos %d segundos em %d dias, %d horas, %d minutos e %d segundos",second_in_day, day, hour, minute, second);
        
        scanner.close();
	}
}

