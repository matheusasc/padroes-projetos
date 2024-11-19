package Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agendador {

    List<ITarefa> tarefas = new ArrayList<>();


    public void ativar(){
        for(ITarefa t:tarefas){
            System.out.println(t.getNome());
            System.out.println(t.getMomento());
            t.executar();
        }
    }

    public void desativar(){

    }

    public List<ITarefa> listar() {
        return tarefas;
    }

    public void addTarefas(ITarefa tarefa) {
        tarefas.add(tarefa);
    }
}
