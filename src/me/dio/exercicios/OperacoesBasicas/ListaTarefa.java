package me.dio.exercicios.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo com uso de generics "List<>"
    private List<Tarefa> tarefaList;

    //Construtor

    public ListaTarefa() {
        //Sempre que um objeto for instanciado, será criado uma ArrayList vazio
        this.tarefaList = new ArrayList<>();
    }
    //Metodos
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));

    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefaRemover=new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaRemover);
    }
    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }
}


