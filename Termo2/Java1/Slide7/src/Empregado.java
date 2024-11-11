import java.util.Scanner;

public class Empregado {
    private String name;
    private int number;
    Scanner scanner = new Scanner(System.in);

    public Empregado(){
        System.out.print("Digite o nome:\n->");
        this.name = scanner.nextLine();
        System.out.print("Digite o numero:\n->");
        this.number = scanner.nextInt(); 
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }
}
