package Agenda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Agendador {
    public static void main(String[] args) {
    Agendador agendador = new Agendador();

    FazerBackup t1 = new FazerBackup();
    EnviarEmail t2 = new EnviarEmail();

     agendador.addTarefas(t1);
     agendador.addTarefas(t2);

     agendador.ativar();
    }
}