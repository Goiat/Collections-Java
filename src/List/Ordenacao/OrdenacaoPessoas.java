package List.Ordenacao;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class OrdenacaoPessoas {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> OrdenarIdade (){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> OrdenarAltura (){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas p = new OrdenacaoPessoas();
        p.adicionarPessoa("Nome 1", 20, 1.56);
        p.adicionarPessoa("Nome 2", 30, 1.80);
        p.adicionarPessoa("Nome 3", 25, 1.75);
        p.adicionarPessoa("Nome 4", 40, 1.60);
        System.out.println(p.OrdenarAltura());
        System.out.println(p.OrdenarIdade());
    }
}

