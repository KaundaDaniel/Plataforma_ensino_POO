import models.Bootcamp;
import models.Curso;

public class OlaMundo {
    public static void main(String[] args) {
        Bootcamp bootcamp= new Bootcamp();
        Curso javaScript= new Curso();
        javaScript.setTitulo("Expert JavaScript");
        bootcamp.setNome("Bootcamp Java Avançado");
    }
}
