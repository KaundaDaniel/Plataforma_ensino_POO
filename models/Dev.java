package models;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Conteudo> listaConteudoInscrito= new ArrayList<>();
    private List<Conteudo> listaConteudoConcluido= new ArrayList<>();

    public void inscrever(Conteudo conteudo){
        if(listaConteudoInscrito.contains(conteudo)){
            System.out.println("Já se enconta inscrito nesse curso");
        }else {
            listaConteudoInscrito.add(conteudo);
        }
    }
    public void inscrever(Bootcamp bootCamp){
        // Adicionando todos os conteúdos do bootcamp à lista de inscrição
//        for(Conteudo conteudo : bootCamp.getDevsInscritos()
//        for(Conteudo conteudo : bootCamp.getListaConteudoEducacional()
//        ){
//            inscrever(conteudo);
//        }
        // Usando os strems em java
        bootCamp.getListaConteudoEducacional().stream().forEach(this::inscrever);
        bootCamp.getDevsInscritos().add(this);


    }


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
        return listaConteudoInscrito;
    }

    public void setListaConteudoIncrito(List<Conteudo> listaConteudoIncrito) {
        this.listaConteudoInscrito = listaConteudoIncrito;
    }

    public List<Conteudo> getListaConteudoConcluido() {
        return listaConteudoConcluido;
    }

    public void setListaConteudoConcluido(List<Conteudo> listaConteudoConcluido) {
        this.listaConteudoConcluido = listaConteudoConcluido;
    }
}
