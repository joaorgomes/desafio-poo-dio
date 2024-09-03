package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    //modificar protect = as classes filhas dessa classe conteudo terao acesso a esse atributo

    protected static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
