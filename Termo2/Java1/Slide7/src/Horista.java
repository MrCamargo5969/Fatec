import java.util.Scanner;

public class Horista extends Empregado{
    private float hourly_rate;
    private float hours_worked;
    
    Scanner scanner = new Scanner(System.in);

    public Horista(){
        System.out.printf("Digite a taxa horária do horista:\n->");
        this.hourly_rate = scanner.nextFloat();

        System.out.printf("Digite a quantidade de horas trabalhadas:\n->");
        this.hours_worked = scanner.nextFloat();
    }

    public float salary_value(){
        return this.hourly_rate * this.hours_worked;
    }
}
