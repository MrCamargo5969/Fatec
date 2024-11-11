public class Estoque {
    public String produto;
    public int quantidade;
    public double preco;

    public Estoque(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarItens(int quantidade) {
        this.quantidade += quantidade;
        System.out.println(quantidade + " unidades de " + produto + " adicionadas ao estoque.");
    }

    public void removerItens(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades de " + produto + " removidas do estoque.");
        } else {
            System.out.println("Quantidade insuficiente no estoque para remover " + quantidade + " unidades de " + produto);
        }
    }

    public void exibirEstoque() {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
    }
}