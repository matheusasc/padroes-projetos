package FlyWeight;

public class TestaPessoaComFlyWeight {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Matheus", LogradouroFactory.getLogradouro("01000-000", "Av Paulista", CidadeFactory.getCidade("Sao Paulo", "Sao Paulo")));
        Pessoa p2 = new Pessoa("Carlos", LogradouroFactory.getLogradouro("69000-000", "Av Djalma Batista", CidadeFactory.getCidade("Manaus", "Amazonas")));
        Pessoa p3 = new Pessoa("Joao", LogradouroFactory.getLogradouro("66600-000", "Av Presidente Vargas", CidadeFactory.getCidade("Belem", "Para")));
        Pessoa p4 = new Pessoa("gabrielly", LogradouroFactory.getLogradouro("01100-000", "Av Atlantica", CidadeFactory.getCidade("Sao Paulo", "Sao Paulo")));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(p1.getLogradouro() == p4.getLogradouro());

        System.out.println(CidadeFactory.getCidades()+"\n");
        System.out.println(LogradouroFactory.getLogradouros()+"\n");

    }
}
