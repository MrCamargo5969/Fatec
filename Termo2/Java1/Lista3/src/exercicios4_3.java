import java.util.Scanner;

public class exercicios4_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int i = 0, nota1 = 0, nota2 = 0, media;
		for (i = 0; i < 10; i ++) {
	        System.out.printf("Digite a nota 1 do aluno %d:\n", i+1);
	        nota1 = scanner.nextInt();
	        System.out.printf("Digite a nota 2 do aluno %d:\n", i+1);
	        nota2 = scanner.nextInt();
	        media = (nota1+nota2)/2;
	        System.out.printf("A mpedia do aluno %d é %d:\n", i+1, media);
		}
		scanner.close();
	}
}
