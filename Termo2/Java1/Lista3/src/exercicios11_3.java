public class exercicios11_3 {
	public static void main(String[] args) {
			for (int i=1000; i<9999; i++) {
				int treeFour = i%100;
				int oneTwo = i/100;
				int raiz = oneTwo + treeFour;
				double quadrado = Math.pow(raiz, 2);
				if (quadrado == i) {System.out.printf("%d\n", i);}
				
			};
	}	
}
