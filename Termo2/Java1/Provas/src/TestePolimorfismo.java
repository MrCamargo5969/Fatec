public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom(); // Saída: Latido
        animal2.emitirSom(); // Saída: Miau
    }
}