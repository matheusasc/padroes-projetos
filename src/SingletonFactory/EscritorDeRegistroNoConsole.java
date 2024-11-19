package SingletonFactory;

public class EscritorDeRegistroNoConsole implements EscritorDeRegistro {
    @Override
    public void escrever(String evento) {
        System.out.println("Escrevendo no console: " + evento);
    }
}
