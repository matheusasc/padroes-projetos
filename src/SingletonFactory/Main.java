package SingletonFactory;

public class Main {
    public static void main(String[] args) {
        // Criando um registro para arquivo
        GerenciadorDeRegistro registrador1 = GerenciadorDeRegistro.obterInstancia(new EscritorDeRegistroEmArquivo());
        registrador1.registrar("Usuário logado no sistema");

        // Criando um registro para console
        GerenciadorDeRegistro registrador2 = GerenciadorDeRegistro.obterInstancia(new EscritorDeRegistroNoConsole());
        registrador2.registrar("Erro ao processar pagamento");
    }
}