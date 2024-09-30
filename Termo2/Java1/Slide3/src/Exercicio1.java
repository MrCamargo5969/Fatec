import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        String name, letter;

        while (true) {
            System.out.printf("Digite um nome:\n-> ");
            name = scanner.nextLine();
            if (name.equals(".")) {
                break;
            }
            lista.add(name.toLowerCase());
        }
        System.out.printf("Nomes:\n");
        for (int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.printf("Digite uma letra a ser removida:\n-> ");
        letter = scanner.nextLine();
        
        for (int i=0; i<lista.size(); i++){
            lista2.add(lista.get(i).replaceAll(letter.toLowerCase(), ""));
        }

        System.out.printf("Nomes sem \"%s\":\n", letter);
        for (int i=0; i<lista2.size(); i++){
            System.out.println(lista2.get(i));
        }

        scanner.close();
    }
}
