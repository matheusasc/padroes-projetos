package Agenda;

import java.util.Date;

public class EnviarEmail implements ITarefa{
    private String nome;
    private Date momento;


    @Override
    public void executar() {
        System.out.println("Enviando email!");
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public Date getMomento() {
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }
}
