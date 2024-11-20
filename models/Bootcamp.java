package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Conteudo> listaConteudoEducacional=new ArrayList<Conteudo>();
    private List<Dev> devsInscritos=new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(List<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Conteudo> getListaConteudoEducacional() {
        return listaConteudoEducacional;
    }

    public void setListaConteudoEducacional(List<Conteudo> listaConteudoEducacional) {
        this.listaConteudoEducacional = listaConteudoEducacional;
    }
}
