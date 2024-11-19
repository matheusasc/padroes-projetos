package FactoryMethods;

public class TestaJanelaFactory {
    public static void main(String[] args) {

        JanelaFactoryAbstrata factory = new JanelaFactoryRev2();

        Janela janela = factory.criarJanela();

        janela.mostrar();

    }

}
