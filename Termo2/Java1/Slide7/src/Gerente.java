import java.util.Scanner;

public class Gerente extends Empregado{
    private float monthly_salary;
    
    Scanner scanner = new Scanner(System.in);
    
    
    public Gerente(){
        System.out.println("Digite o salário mensal do gerente: ");
        monthly_salary = scanner.nextFloat();
    }
    public float salary_value(){
        return monthly_salary;
    }
}
