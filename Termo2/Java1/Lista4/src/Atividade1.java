import java.util.Scanner;
public class Atividade1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		int i, menor = 1000000, maior = 0;
		
		Scanner ler = new Scanner(System.in);
		for (i = 0; i<5; i++) {
			System.out.print("A["+i+"] = ");
			a[i] = ler.nextInt();
		}
		for (i = 0; i<5; i++) {
			if (a[i]< menor) {
				menor = a[i];
			}
		}
		for (i = 0; i<5; i++) {
			if (a[i]>maior) {
				maior = a[i];
			}
		}
		System.out.printf("\nVetor lido:\n");
		for (i=0; i<5; i++) {
			if (a[i] == menor) {
				System.out.println("A["+i+"] = "+a[i]+" <-- Menor lido");
			}
			else if (a[i] == maior) {
				System.out.println("A["+i+"] = "+a[i]+" <-- Maior lido");
			} else System.out.println("A["+i+"] = "+a[i]);
		}
		ler.close();
	}
}
