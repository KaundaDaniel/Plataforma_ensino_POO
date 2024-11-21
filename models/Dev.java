package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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



    public void progredir(){
        Optional<Conteudo> conteudo=listaConteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            listaConteudoConcluido.add(conteudo.get());
            listaConteudoInscrito.remove(conteudo.get());
        }else {
            System.err.println("Voce não terminou nenhum curso!");
        }

    }

    public double calcularXP(){
        double xpGanho=listaConteudoConcluido.stream().mapToDouble(Conteudo::calcularXp).sum();
        return xpGanho;
    }
}
