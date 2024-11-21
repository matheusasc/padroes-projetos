package State;

public class Enviado implements Status{

    private Pedido pedido;

    public Enviado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void pagar() {
        System.out.println("Pedido já pago!");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido já enviado!");
    }
}
