package Command;

public class EnviarPedidoDeEntregaNaLogistica implements Comando{

    private LogisticaVenda logisticaVenda;

    public EnviarPedidoDeEntregaNaLogistica(LogisticaVenda logisticaVenda) {
        this.logisticaVenda = logisticaVenda;
    }

    @Override
    public void executar() {
        logisticaVenda.enviarPedidoDeEntregaNaLogistica();
    }
}
