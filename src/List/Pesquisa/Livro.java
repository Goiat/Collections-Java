package List.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String Autor;
    private int anoPublicacao;
    //construtor

    public Livro(java.lang.String titulo, java.lang.String autor, int anoPublicacao) {
        this.titulo = titulo;
        Autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    // metodos especias

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public java.lang.String getAutor() {
        return Autor;
    }

    public void setAutor(java.lang.String autor) {
        Autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    @Override
    public java.lang.String toString() {
        return "Livro{" +
                "titulo=" + titulo +
                ", Autor=" + Autor +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
