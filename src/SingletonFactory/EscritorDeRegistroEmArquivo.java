package SingletonFactory;

public class EscritorDeRegistroEmArquivo implements EscritorDeRegistro  {
    @Override
    public void escrever(String evento) {
        System.out.println("Escrevendo em arquivo: " + evento);
    }
}
