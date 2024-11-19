package Command;

public class EnviarEmailParaClienteComando implements Comando{

    private LogisticaVenda logisticaVenda;

    public EnviarEmailParaClienteComando(LogisticaVenda logisticaVenda) {
        this.logisticaVenda = logisticaVenda;
    }

    @Override
    public void executar() {
        logisticaVenda.enviarEmailParaCliente();
    }
}
