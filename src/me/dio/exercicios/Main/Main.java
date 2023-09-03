package me.dio.exercicios.Main;

import me.dio.exercicios.OperacoesBasicas.ListaTarefa;

public class Main {
    public static void main(String[] args) {
        ListaTarefa lista=new ListaTarefa();

        lista.adicionarTarefa("Estudar Java Collections");
        lista.adicionarTarefa("Estudar Java: OOP");
        lista.adicionarTarefa("Estudar Java SpringBoot");

        lista.removerTarefa("Estudar Java SpringBoot");
        System.out.println("O numero total de tarefas é: "+lista.obterNumeroTotalTarefa());
        lista.obterDescricaoTarefa();


    }
}