package State;

public class TestaPedido {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.pagar();

        pedido.enviar();

        pedido.pagar();

        pedido.enviar();

    }

}
