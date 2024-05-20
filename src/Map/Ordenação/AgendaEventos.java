package Map.Ordenação;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> dataEventoMap;

    public AgendaEventos() {
        this.dataEventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        dataEventoMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> evetosTreeMap = new TreeMap<>(dataEventoMap);
        System.out.println(dataEventoMap);
    }
    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet =  dataEventoMap.keySet();
        Collection<Evento> values= dataEventoMap.values();
         */
        //dataEventoMap.get()
        LocalDate dataAtual =LocalDate.now();
        Map<LocalDate, Evento> evetosTreeMap = new TreeMap<>(dataEventoMap);
        for (Map.Entry<LocalDate, Evento> entry : evetosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + " Acontecerá na data: " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos p = new AgendaEventos();

        p.adicionarEvento(LocalDate.of(2022, 4, 15 ), "Evento 1", "Atração 1");
        p.adicionarEvento(LocalDate.of(2022, 9, 9 ), "Evento 2", "Atração 2");
        p.adicionarEvento(LocalDate.of(2000, Month.AUGUST, 12 ), "Evento 3", "Atração 3");
        p.adicionarEvento(LocalDate.of(2024, 5, 20 ), "Evento 4", "Atração 4");

        p.exibirAgenda();

        p.obterProximoEvento();
    }
}
