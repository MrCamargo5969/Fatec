import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo(0);
        Cilindro cilindro = new Cilindro(0, 0);
        Quadrado quadrado = new Quadrado(0, 0);
        Cubo cubo = new Cubo(0, 0, 0);

        int choice;

        while (true) {
            System.out.printf("1. Circulo\n2. Cilindro\n3. Quadrado\n4. Cubo\n5. Sair\n");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Você escolheu: Circulo");
                    System.out.printf(" 1. Cadastrar\n 2. Imprimir\n 3. Cálculo da área\n 4. Cálculo do Perímetro\n");
                    System.out.print("Escolha uma opção: ");
                    int escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            System.out.println("Digite o raio: ");
                            circulo.setRay(scanner.nextDouble());
                            break;
                        case 2:
                            circulo.print();
                            break;
                        case 3:
                            circulo.area();
                            break;
                        case 4:
                            circulo.perimeter();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    
                    break;
                case 2:
                    System.out.println("Você escolheu: Cilindro");
                    System.out.printf(" 1. Cadastrar\n 2. Imprimir\n 3. Cálculo da área\n 4. Cálculo do Volume\n");
                    System.out.print("Escolha uma opção: ");
                    int escolha0 = scanner.nextInt();

                    switch (escolha0) {
                        case 1:
                            System.out.println("Digite o raio: ");
                            cilindro.setRay(scanner.nextDouble());
                            System.out.println("Digite a altura: ");
                            cilindro.setHigh(scanner.nextDouble());
                            break;
                        case 2:
                            cilindro.print();
                            break;
                        case 3:
                            cilindro.area();
                            break;
                        case 4:
                            cilindro.volume();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu: Quadrado");
                    System.out.printf(" 1. Cadastrar\n 2. Imprimir\n 3. Cálculo da área\n 4. Cálculo do Perímetro\n");
                    System.out.print("Escolha uma opção: ");
                    int escolha1 = scanner.nextInt();

                    switch (escolha1) {
                        case 1:
                            System.out.println("Digite a largura: ");
                            quadrado.setWidth(scanner.nextDouble());
                            System.out.println("Digite o comprimento: ");
                            quadrado.setLength(scanner.nextDouble());
                            break;
                        case 2:
                            quadrado.print();
                            break;
                        case 3:
                            quadrado.area();
                            break;
                        case 4:
                            quadrado.perimeter();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu: Cubo");
                    System.out.printf(" 1. Cadastrar\n 2. Imprimir\n 3. Cálculo da área\n 4. Cálculo do Volume\n");
                    System.out.print("Escolha uma opção: ");
                    int escolha2 = scanner.nextInt();

                    switch (escolha2) {
                        case 1:
                            System.out.println("Digite a largura: ");
                            cubo.setWidth(scanner.nextDouble());
                            System.out.println("Digite o comprimento: ");
                            cubo.setLength(scanner.nextDouble());
                            System.out.println("Digite a altura: ");
                            cubo.setHigh(scanner.nextDouble());
                            break;
                        case 2:
                            cubo.print();
                            break;
                        case 3:
                            cubo.area();
                            break;
                        case 4:
                            cubo.volume();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                default:
                    System.out.println("Finalizando o Programa...");
                    System.exit(0);
            }
        }
    }
}
