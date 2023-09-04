package me.dio.exercicios.Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogoLivros {
    private List<Livro> livroList;

    //Cosntrutor

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }
    public List<Livro> pesquisaAutor(String autor){
        List<Livro>livrosAutor=new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(l);
                }
            }

        }

        return livrosAutor;
    }
    public List<Livro> pesquisaIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAno=new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getAnoPublicacao()>=anoInicial&& l.getAnoPublicacao()<=anoFinal){
                    livrosIntervaloAno.add(l);
                }
            }
        }

        return livrosIntervaloAno;
    }
    //Depois tentar aprimorar com pesquisa com partes da palavra
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo=null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo=l;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CatalogoLivros catalogo=new CatalogoLivros();
        catalogo.adicionarLivro("Java Guia do Programador - 4ª Edição",
                "Peter Jandl Jr.",
                2021);
        catalogo.adicionarLivro("Java®: Como Programar",
                "Harvey Deitel",
                2017);
        catalogo.adicionarLivro("Cómo programar en JAVA"+"\n" +
                "Edição Espanhol"," Paul J Deitel ",2018);


//        System.out.println(catalogo.pesquisaAutor(" Paul J Deitel "));



        System.out.print("Digite um título para pesquisar: ");
        String pesquisa=sc.nextLine();
        System.out.println("Você pesquisou por: "+ catalogo.pesquisaPorTitulo(pesquisa));
        System.out.print("Pesquisa por ano de publicação: ");
        int anoI=sc.nextInt();
        int anoF= sc.nextInt();
        System.out.println("A pesquisa encontrou: "+catalogo.pesquisaIntervaloAno(anoI,anoF));




    }
}
