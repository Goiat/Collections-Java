package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adcionarContato(String nome, int numeroTelefone){
        contatoSet.add(new Contato(nome, numeroTelefone));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set <Contato> contatosPorNome = new HashSet<>();
        for(Contato l: contatoSet){
            if(l.getNome().startsWith(nome)){
                contatosPorNome.add(l);

            }
        }
        return contatosPorNome;
    }
    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato l : contatoSet){
            if(l.getNome().equalsIgnoreCase(nome)){
                l.setNumeroTelefone(novoNumero);
                contatoAtualizado = l;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos c = new AgendaContatos();
        c.exibirContatos();

        c.adcionarContato("Tiago", 95);
        c.adcionarContato("Tiago", 59);
        c.adcionarContato("João", 32);
        c.adcionarContato("Clodovil", 42);

        c.exibirContatos();

        System.out.println(c.pesquisarPorNome("Tiago"));
        System.out.println(c.atualizarContato("Tiago", 234));
    }
}
