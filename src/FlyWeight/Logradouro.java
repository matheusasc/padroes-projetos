package FlyWeight;

public class Logradouro {

    private String cep;
    private String nome;
    private Cidade cidade;

    public Logradouro() {
    }

    public Logradouro(String cep, String nome, Cidade cidade) {
        this.cep = cep;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Logradouro{" +
                "cep='" + cep + '\'' +
                ", nome='" + nome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
