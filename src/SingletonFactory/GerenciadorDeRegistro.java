package SingletonFactory;

public class GerenciadorDeRegistro {
    private static GerenciadorDeRegistro instancia;
    private EscritorDeRegistro escritor;

    private GerenciadorDeRegistro(EscritorDeRegistro escritor) {
        this.escritor = escritor;
    }

    public static GerenciadorDeRegistro obterInstancia(EscritorDeRegistro escritor) {
        if (instancia == null) {
            instancia = new GerenciadorDeRegistro(escritor);
        }
        return instancia;
    }

    public void registrar(String evento) {
        escritor.escrever(evento);
    }
}
