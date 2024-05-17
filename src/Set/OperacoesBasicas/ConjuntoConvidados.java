package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoset;

    public ConjuntoConvidados() {
        this.convidadoset = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoset.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado l : convidadoset){
            if(l.getCodigoConvite() == (codigoConvite)){
                convidadoParaRemover = l;
                break;
            }

        }
        convidadoset.remove(convidadoParaRemover);
    }
    public int contarConidados(){
        return convidadoset.size();
    }
    public void exbirConvidados(){
        System.out.println(convidadoset);
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();
        System.out.println("Existe " + c.contarConidados() + " dentro do set Convidados.");
        c.adicionarConvidado("Convidado 1", 123);
        c.adicionarConvidado("Convidado 2",321);
        c.adicionarConvidado("Convidado 3",231);
        c.adicionarConvidado("Convidado 4",231);
        System.out.println("Existe " + c.contarConidados() + " dentro do set Convidados.");
        c.removerConvidado(231);
        c.exbirConvidados();
    }

}
