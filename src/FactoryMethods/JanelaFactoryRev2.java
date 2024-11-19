package FactoryMethods;

public class JanelaFactoryRev2 extends JanelaFactoryAbstrata{

    public Janela criarJanela(){

        String so = System.getProperty("os.name").toLowerCase();

        if (so.contains("win")){
            return new WindowsJanela();
        } else if (so.contains("mac")){
            return new MacOSJanela();
        } else if (so.contains("lin")){
            return new LinuxJanela();
        }

        return null;
    }

}
