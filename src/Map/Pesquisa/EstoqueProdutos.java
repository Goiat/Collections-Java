package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
    public Double caulcularValorTotalDoEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto l: estoqueProdutosMap.values()) {
                if (l.getPreco() > maiorPreco) {
                    maiorPreco = l.getPreco();
                    produtoMaisCaro = l;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos p = new EstoqueProdutos();
        p.exibirProduto();

        p.adicionarProduto(13L, "Pasta de dente", 3.69, 4);
        p.adicionarProduto(45L, "Escova", 4.69, 10);
        p.adicionarProduto(321L, "Clareador", 11.50, 5);
        p.adicionarProduto(123L, "Fio Dental", 2.30, 20);

        p.exibirProduto();

        System.out.println("Produto mais caro: " + p.produtoMaisCaro());
        System.out.println("Valor total do estoque: " + p.caulcularValorTotalDoEstoque());
    }
}
