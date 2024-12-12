package State;

public class Pedido {

    private Novo novo = new Novo(this);
    private Pago pago = new Pago(this);
    private Enviado enviado = new Enviado(this);

    private Status status = novo;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Novo getNovo() {
        return novo;
    }

    public Pago getPago() {
        return pago;
    }

    public Enviado getEnviado() {
        return enviado;
    }

    public Status getStatus() {
        return status;
    }

    void pagar(){
        this.status.pagar();
    }

    void enviar(){
        this.status.enviar();
    }
}
