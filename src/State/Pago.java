package State;

public class Pago implements Status{

    private Pedido pedido;

    public Pago(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void pagar() {
        System.out.println("Pedido já foi pago!");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido será enviado.");
        this.pedido.setStatus(this.pedido.getEnviado());
    }
}
