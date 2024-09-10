import java.util.Scanner;

public class exercicios4_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cateto1, cateto2, hipotenusa;
        System.out.printf("Digite um cateto:\n");
        cateto1 = scanner.nextInt();
        
        System.out.printf("Digite outro cateto:\n");
        cateto2 = scanner.nextInt();
        
        System.out.print("Digite a hipotenusa:\n");
        hipotenusa = scanner.nextInt();
        if (cateto1 == cateto2 && cateto2 == hipotenusa) {System.out.print("triangulo equilátero");}
        else if (cateto1 != cateto2 && cateto2 != hipotenusa && cateto1 != hipotenusa) {System.out.print("triangulo escaleno");}
        else {System.out.print("triangulo isóceles");}

        
        scanner.close();
        
        
        
	}
}
