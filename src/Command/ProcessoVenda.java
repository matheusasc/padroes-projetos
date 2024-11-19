package Command;

import java.util.ArrayList;
import java.util.List;

public class ProcessoVenda {

    List<Comando> comandos = new ArrayList<>();

    public void addComando(Comando comando){
        this.comandos.add(comando);
    }

    public void executarComandos() {
        for(Comando comando: comandos){
            comando.executar();
        }
    }
}
