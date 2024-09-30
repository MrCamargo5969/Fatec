import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        String name;

        while (true) {
            System.out.printf("Digite um nome:\n-> ");
            name = scanner.nextLine();
            if (name.equals(".")) {
                break;
            }
            lista.add(name);
        }
        for (String item : lista) {
            String[] names = item.split(" ");
            for (int i=0; i<names.length; i++){
            System.out.printf("%s.",names[i].substring(0, 1));
            }
            System.out.println();
        }

        scanner.close();
    }
}
