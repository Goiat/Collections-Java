package Set.Ordenacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adcionarProduto(String nome, int codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(String nome){
        Set<Produto> protudosPornome = new TreeSet<>(produtoSet);
        return protudosPornome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> protudosPorPreco = new TreeSet<>(new comparator());
        protudosPorPreco.addAll(produtoSet);
        return protudosPorPreco;
    }


}
