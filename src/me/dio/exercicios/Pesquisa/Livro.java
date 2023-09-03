package me.dio.exercicios.Pesquisa;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //Construtor


    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }


    //Metodo especiais


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "-".repeat(44)+"\n" +
                " INFORMAÇÕES GERAIS SOBRE O LIVRO\n" +
                "-".repeat(44)+"\n"+
                "Titulo: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Ano de Publicação: " + anoPublicacao+"\n"+
                "-".repeat(44);
    }
}





