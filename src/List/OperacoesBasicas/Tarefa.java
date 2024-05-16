package List.OperacoesBasicas;

public class Tarefa  {
    private String descricao;

    public Tarefa(java.lang.String descricao) {
        this.descricao = descricao;
    }

    public java.lang.String getDescricao() {
        return descricao;
    }

    @Override
    public java.lang.String toString() {
        return "Tarefa{" +
                "descricao=" + descricao +
                '}';
    }
}
