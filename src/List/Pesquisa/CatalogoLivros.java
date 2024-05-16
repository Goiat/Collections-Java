package List.Pesquisa;
import java.util.List;
import java.util.ArrayList;
public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public Livro PesquisaPorAutor(String autor) {
         Livro livrosPorAutor = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor = l;
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> PesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> PesquisaPorTitulos(String Titulo) {
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(Titulo)){
                    livrosPorTitulo.add(l);
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
       CatalogoLivros livros = new CatalogoLivros();
       livros.adicionarLivro("Livro 1", "Autor 1", 1998);
       livros.adicionarLivro("Livro 2", "Autor 2", 2003);
       livros.adicionarLivro("Livro 3", "Autor 2", 2024);
       livros.adicionarLivro("Livro 4", "Autor 4", 1970);
        System.out.println(livros.PesquisaPorAutor("Autor 2"));
        System.out.println(livros.PesquisaPorIntervaloAnos(1970, 2004));
    }
}
