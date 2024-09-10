import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Exercicio9 {
	public static void main(String[] args) {
		Random generator = new Random();
		Set<Integer> unique = new HashSet<>();
		
		int i, vetorA[] = new int [10];
		
		while (unique.size() < vetorA.length) {
			unique.add(generator.nextInt(49) + 1);
		}
		
		List<Integer> list = new ArrayList<>(unique);
		
		for (i=0; i<vetorA.length; i++) {
			vetorA[i] = list.get(i);
		}
		System.out.printf("Vetor A:\n");
		for (i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		};

	}
}