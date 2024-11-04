import java.util.Scanner;
public class Count {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int number;
    private float balance;
    private Card card = new Card();

    public void constructor(){
        while (true){
        System.out.printf("Digite o nome de Usuario:\n");
        name = scanner.nextLine();
        System.out.printf("Digite o numero da conta:\n");
        number = scanner.nextInt();
        System.out.printf("Digite o Saldo:\n");
        balance = scanner.nextFloat();
        card.constructor();
        if (number < 9999 && number > 0000){
            break;
        }
        }
    }

    public void deposit(float sum){
        balance += sum;
    }

    public boolean remove(float sub){
        if (balance >= sub){
        balance -= sub;
        return true;
        }
        else {System.out.printf("Valor invalido...");
        return false;
        }
    }

    public void consult_balance(){
        System.out.printf("Saldo Atual: %.2f\n", balance);
    }

    public boolean verify(String pass){
        if (card.verify(pass)){
            return true;
        }
        else return false;
    }
}
