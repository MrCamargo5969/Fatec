import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Refrigerante coca = new Refrigerante(true);
        Vinho bourbon = new Vinho(2345);
        Suco pratts = new Suco("Uva");

        List<Bebida> bebidas = new ArrayList<>();
        bebidas.add(coca);
        bebidas.add(bourbon);
        bebidas.add(pratts);

        for (Bebida bebida : bebidas) {
            bebida.mostraBebida();
            System.out.println("------");
        }
    }
}
