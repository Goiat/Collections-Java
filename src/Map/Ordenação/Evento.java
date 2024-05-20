package Map.Ordenação;

public class Evento {
    private String nomeEvento;
    private String atração;

    public Evento(String nomeEvento, String atração) {
        this.nomeEvento = nomeEvento;
        this.atração = atração;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getAtração() {
        return atração;
    }

    public void setAtração(String atração) {
        this.atração = atração;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", atração='" + atração + '\'' +
                '}';
    }
}
