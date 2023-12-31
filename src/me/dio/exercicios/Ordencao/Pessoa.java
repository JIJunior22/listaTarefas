package me.dio.exercicios.Ordencao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    //Construtor

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public int compareTo(Pessoa p) {
        //Compara this.idade com o argumento
        return Integer.compare(idade,p.getIdade());
    }

    //Metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "--= LISTA DE PESSOAS =--" +"\n"+
                "Nome: " + nome +"\n"+
                "Idade: " + idade +"\n"+
                "Altura: " + altura+"\n"+
                "-".repeat(25)+"\n";
    }
}
class ComparatorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(),p2.getAltura());
    }
}
