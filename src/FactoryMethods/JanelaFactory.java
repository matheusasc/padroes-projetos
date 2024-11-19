package FactoryMethods;

public class JanelaFactory extends JanelaFactoryAbstrata {

    public Janela criarJanela(){

        String so = System.getProperty("os.name").toLowerCase();

        if (so.contains("win")){
            return new WindowsJanela();
        } else if (so.contains("mac")){
            return new MacOSJanela();
        }

        return null;
    }
}
