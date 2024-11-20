package models;

import java.util.List;

public class Dev {
    private String nome;
    private List<Conteudo> listaConteudoIncrito;
    private List<Conteudo> listaConteudoConcluido;

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conteudo> getListaConteudoIncrito() {
        return listaConteudoIncrito;
    }

    public void setListaConteudoIncrito(List<Conteudo> listaConteudoIncrito) {
        this.listaConteudoIncrito = listaConteudoIncrito;
    }

    public List<Conteudo> getListaConteudoConcluido() {
        return listaConteudoConcluido;
    }

    public void setListaConteudoConcluido(List<Conteudo> listaConteudoConcluido) {
        this.listaConteudoConcluido = listaConteudoConcluido;
    }
}
