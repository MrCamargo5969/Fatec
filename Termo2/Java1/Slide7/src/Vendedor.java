import java.util.Scanner;

public class Vendedor extends Empregado{
    private float wage;
    private float sales;
    private float commission;  
    
    Scanner scanner = new Scanner(System.in);
    
    public Vendedor(){
        System.out.print("Digite o salario:\n->");
        this.wage = scanner.nextFloat();
        
        System.out.print("Digite o total de vendas:\n->");
        this.sales = scanner.nextFloat();
        
        System.out.print("Digite o valor da comissão:\n->");
        this.commission = scanner.nextFloat();
        
    }

    public float wageResult(){
        return (wage + sales * commission);
    }
}
