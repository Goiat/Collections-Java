package List.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }


    //metodos:
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));

    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasromover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasromover.add(t);
            }
        }
        tarefaList.removeAll(tarefasromover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();

    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas t = new ListaTarefas();
        t.adicionarTarefa("Tarefa 1");
        t.adicionarTarefa("Tarefa 1");
        t.adicionarTarefa("Tarefa 2");
        System.out.println("Numero total de elementos:" + t.obterNumeroTotalTarefas());
        t.removerTarefa("Tarefa 1");
        System.out.println("Numero total de elementos:" + t.obterNumeroTotalTarefas());
        t.obterDescricoesTarefas();
    }
}
