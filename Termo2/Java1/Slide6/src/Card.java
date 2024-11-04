import java.util.Scanner;
public class Card {
    private String password;

    public void constructor(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Digite a nova senha:\n");
            String match1 = scanner.nextLine();
            System.out.printf("Repita a senha:\n");
            String match2 = scanner.nextLine();
            if (match1.equals(match2)){
                password = match1;
                break;
            }
            else {
                System.out.printf("As senhas não conferem.\n");
            }
        }
    }

    public boolean verify(String pass){
        if (pass.equals(password)){
            return true;
        }
        else {
            System.out.printf("Senha Invalida\n");
            return false;
        }
    }
}
