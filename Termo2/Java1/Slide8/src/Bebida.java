import java.util.Scanner;

public abstract class Bebida {
    protected String name;
    protected float price;
    java.util.Scanner scanner = new Scanner(System.in);

    public Bebida(){
        System.out.printf("Digite o nome da bebida:\n->");
        this.name = scanner.nextLine();
        System.out.printf("Digite o preço da bebida:\n->");
        this.price = scanner.nextFloat();
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract void mostraBebida();
}
