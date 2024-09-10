import java.util.Random;

public class exercicios7_3 {
	public static void main(String[] args) {
		Random generator = new Random();
        int x = 50, maior = 0, menor = x;
        
        for (int i=0; i<x; i++) {
        	int random = generator.nextInt(x+1);
        	System.out.println(random);
        	if (random > maior) {
        		maior = random;
        	}
        	else if (random < menor) {
        		menor = random;
        	};
        	
        	
        }
        System.out.printf("O maior numero gerado é %d.\nO menor numero gerado é %d.", maior, menor);
        
	}
	
}