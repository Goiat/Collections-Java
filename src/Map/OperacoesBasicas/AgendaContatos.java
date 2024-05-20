package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //ATRIBUTO
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adcionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    public Integer PesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos a = new AgendaContatos();

        a.adcionarContato("Baraqui",312);
        a.adcionarContato("Taraqui",312);
        a.adcionarContato("Characki",312);
        a.adcionarContato("Bardacki",312);
        a.adcionarContato("Grovaski",312);
        a.adcionarContato("Embarabasqui",312);

        a.exibirContato();
        a.removerContato("Baraqui");
        a.exibirContato();

        System.out.println("O numero é: " + a.PesquisaPorNome("Embarabasqui"));
    }
}
