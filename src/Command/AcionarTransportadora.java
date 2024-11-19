package Command;

public class AcionarTransportadora implements Comando{

    private LogisticaVenda logisticaVenda;

    public AcionarTransportadora(LogisticaVenda logisticaVenda) {
        this.logisticaVenda = logisticaVenda;
    }

    @Override
    public void executar() {
        logisticaVenda.acionarTransportadora();
    }
}
