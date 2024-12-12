package FlyWeight;

public class Pessoa {

    private String nome;
    private Logradouro logradouro;

    public Pessoa(String nome, Logradouro logradouro) {
        this.nome = nome;
        this.logradouro = logradouro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", logradouro=" + logradouro +
                '}';
    }
}
