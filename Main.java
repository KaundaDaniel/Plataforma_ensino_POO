import models.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Curso de JavaScript
        Curso javaScript= new Curso();
        javaScript.setTitulo("Expert JavaScript");
        javaScript.setCargaHoraria(180);
        javaScript.setDescricao("Curso de JavaScript avançado");

        //Curso de Java
        Curso java = new Curso();
        java.setTitulo("Expert Java");
        java.setCargaHoraria(180);
        java.setDescricao("Curso de Java avançado");

        //Curso de GoLang
        Curso goLang= new Curso();
        goLang.setTitulo("Expert Go");
        goLang.setCargaHoraria(180);
        goLang.setDescricao("Curso de Go avançado");

        //Mentoria de JavaScript
        Curso ruby= new Curso();
        ruby.setTitulo("Expert Ruby");
        ruby.setCargaHoraria(180);
        ruby.setDescricao("Curso de Ruby avançado");

        //Mentoria de Java
        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("Mentoria Java Avançado");
        mentoria.setDescricao("Mentoria sobre Java avançado");
        mentoria.setData(LocalDateTime.now()); // Inserir data de início da mentoria

        //BootCamp de C#
        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp C#");
        bootcamp.setDataInicio(LocalDate.of(2022, 1, 1));
        bootcamp.setDataFim(LocalDate.of(2022, 6, 30));
        List<Conteudo> listaConteudo= Arrays.asList(java, javaScript, goLang, ruby, mentoria);
        bootcamp.setListaConteudoEducacional(listaConteudo);

        Dev dev1 = new Dev("Kaunda");
        Dev dev2 = new Dev("João");
        dev1.inscrever(java);
        dev1.inscrever(java);


    }
}
