import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1;
        System.out.println("Digite uma palavra: ");
        word1 = scanner.next();
        System.out.println("");
        System.out.println(word1);
        
        scanner.nextLine();
        
        String word2;
        System.out.println("Digite uma frase: ");
        word2 = scanner.nextLine();
        System.out.println("");
        System.out.println(word2);
        System.out.println(word2.charAt(0));
        
        scanner.close();
    }
}
