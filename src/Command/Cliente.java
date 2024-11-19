package Command;

public class Cliente {

    public static void main(String[] args) {

        LogisticaVenda logisticaVenda = new LogisticaVenda();

        EnviarEmailParaClienteComando enviarEmail = new EnviarEmailParaClienteComando(logisticaVenda);
        EnviarPedidoDeEntregaNaLogistica enviarPedido = new EnviarPedidoDeEntregaNaLogistica(logisticaVenda);
        AcionarTransportadora acionarTransportadora= new AcionarTransportadora(logisticaVenda);

        ProcessoVenda processoVenda = new ProcessoVenda();
        processoVenda.addComando(enviarPedido);
        processoVenda.addComando(acionarTransportadora);
        processoVenda.addComando(enviarEmail);

        processoVenda.executarComandos();
    }
}
