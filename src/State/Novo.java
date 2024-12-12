package State;

public class Novo implements Status{

    private Pedido pedido;

    public Novo(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void pagar() {
        System.out.println("Pedido pago!");
        this.pedido.setStatus(this.pedido.getPago());
    }

    @Override
    public void enviar() {
        System.out.println("Pedido não pode ser enviado" +
                " antes do pagamento");
    }
}
