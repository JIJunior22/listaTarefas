package me.dio.exercicios.OperacoesBasicas;

public class Tarefa {
//    Atributo
    private String descricao;

//    Construtor
    public Tarefa(String descricao){
        this.descricao=descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "--= TAREFAS =--" +"\n"+
                "Descricao: " + descricao+"\n";
    }
}
