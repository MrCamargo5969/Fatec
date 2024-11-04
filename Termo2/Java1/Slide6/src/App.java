import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Count client = new Count();
        client.constructor();
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("\nDigite a senha para continuar:\n");
            String pass = scanner.nextLine();
            if (client.verify(pass)) {break;}
        }
        while (true){
            System.out.println();
            System.out.printf("CONTA CORRENTE\n1 - Depósito\n2 - Retirada\n3 - Consulta Saldo\n4 - Alterar senha\n5 - Sair\nOpção: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if (option <= 4 && option >=1){
                switch (option) {
                    case 1:
                        System.out.print("Digite o valor do depositar: ");
                        float deposito = scanner.nextInt();
                        client.deposit(deposito);
                        break;
                    case 2:
                        System.out.print("Digite o valor de retirada: ");
                        float retirada = scanner.nextInt();
                        client.remove(retirada);
                        break;
                    case 3:
                        client.consult_balance();
                        break;
                    case 4:
                        client.new_password();
                        break;
                    case 5:
                        System.out.print("Saindo...\n");
                        System.exit(0);
                }
            }
        }
    }
}