package Agenda;

import java.util.Date;

public class FazerBackup implements ITarefa {


    private String nome;
    private Date momento;


    @Override
    public void executar() {
        System.out.println("Fazendo backup!");
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public Date getMomento() {
        return null;
    }


}