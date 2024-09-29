//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class P1 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		String nome, idade, RA, resp;
//		List<String> atividades = new ArrayList<>();
//		int i = 1;
//		
//		System.out.printf("Informe seu nome:\n-> ");
//		nome = scanner.nextLine();
//		System.out.printf("Informe sua idade:\n-> ");
//		idade = scanner.nextLine();
//		System.out.printf("Informe seu RA:\n-> ");
//		RA = scanner.nextLine();
//		
//		while (true) {
//			System.out.printf("Digite a atividade %d:\n-> ", i);
//			String atividade = scanner.nextLine();
//			if (atividade.equalsIgnoreCase("fim")) {
//				break;
//			}
//			atividades.add(atividade);
//			i++;
//		}
//		
//		System.out.printf("Resumo do dia para %s - Idade: %s, RA: %s\n", nome, idade, RA);
//		System.out.printf("Atividades Registradas:\n");
//		for (int j=0; j<atividades.size(); j++) {
//			System.out.printf("%d. %s.\n", j+1, atividades.get(j));
//		}
//		scanner.close();
//		
//	}
//}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome, RA, situacao;
		float p1 = 0, p2 = 0, p3 = 0, media = 0;
		
		System.out.printf("Informe seu nome:\n-> ");
		nome = scanner.nextLine();
		System.out.printf("Informe seu RA:\n-> ");
		RA = scanner.nextLine();
		
		System.out.printf("Digite a nota da Prova 1\n-> ");
		p1 = scanner.nextFloat();
		
		System.out.printf("Digite a nota da Prova 2\n-> ");
		p2 = scanner.nextFloat();
		
		System.out.printf("Digite a nota da Prova 3\n-> ");
		p3 = scanner.nextFloat();
		
		media = (p1+p2+p3)/3;
		
		if (media >= 7.0) {
			situacao = "Aprovado";
		}
		else if (media < 7.0 && media >= 5.0) {
			situacao = "em Recuperação";
		}
		else situacao = "Reprovado";
		
		System.out.printf("Olá, %s - RA: %s, sua média semestral é %.2f. Você está %s.", nome, RA, media, situacao);
		scanner.close();
		
	}
}

