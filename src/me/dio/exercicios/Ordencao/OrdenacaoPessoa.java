package me.dio.exercicios.Ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList = new ArrayList<>();

    //Contrutor

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();

    }

    //Metodo
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarIdade() {
        //O Array recebe a lista de pessoas do atributo e passa como argumento, fazendo com quê ela inicie
        // com todos os elementos da lista de pessoas, para posteriormente ser ordenada com um método sort()
        List<Pessoa> pessoaIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaIdade);
        return pessoaIdade;


    }

    public List<Pessoa> ordenarAltura() {
        List<Pessoa> pessoaAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaAltura, new ComparatorAltura());
        return pessoaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenar=new OrdenacaoPessoa();
        ordenar.adicionarPessoa("Junior",28,1.78);
        ordenar.adicionarPessoa("Luke",5,1.30);
        ordenar.adicionarPessoa("Francisco",25,1.70);
        ordenar.adicionarPessoa("Amora",4,1.20);

        System.out.println("LISTA SEM ORDENAÇÃO");
        System.out.println(ordenar.pessoaList);
        System.out.println("**".repeat(20));
        System.out.println("ORDENANDO POR IDADE");
        System.out.println(ordenar.ordenarIdade());
        System.out.println("ORDENANDO POR ALTURA");
        System.out.println(ordenar.ordenarAltura());

    }
}
