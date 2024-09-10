import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        
        while (true) {
            double number1;
            System.out.println("Digite um valor: ");
            number1 = scanner.nextDouble();
            
            double number2;
            System.out.println("Digite um valor: ");
            number2 = scanner.nextDouble();
            
            double number3;
            System.out.println("Digite um valor: ");
            number3 = scanner.nextDouble();
            
            lista.add(number1);
            lista.add(number2);
            lista.add(number3);
            
            Collections.sort(lista);
            System.out.println("Lista atual: " + lista);
            
            System.out.println("Deseja adicionar mais números? (s/n): ");
            scanner.nextLine();
            String resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("n")) {
                break;
        
        }
    }
    scanner.close();
    System.out.println("Programa encerrado.");
}}