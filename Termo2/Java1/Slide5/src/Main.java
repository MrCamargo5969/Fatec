import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Media media = new Media();
        Random random = new Random();

        for (int i=1; i<5; i++) {
            media.added(i);
        };
        System.out.printf("Média gerada foi de %.2f", media.currentMean());
    }
}
