package FreteStrategy;

public class FreteNomal implements  FreteStrategy{
    @Override
    public void calcularFrete(double km, double peso) {
        System.out.println("km: " + km);
        System.out.println("Peso: " + peso);
        double calculo = (2*km) + (1* peso);
        System.out.println("O valor do frete normal fica: " + calculo );
    }
}
