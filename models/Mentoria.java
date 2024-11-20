package models;

import java.time.LocalDateTime;

public class Mentoria extends  Conteudo {
    private LocalDateTime data;

    public Mentoria(String titulo, String descricao, LocalDateTime data) {
        this.data = data;
    }
    public Mentoria(){

    }


    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRADO;
    }
}
