package FlyWeight;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CidadeFactory {


    private static final Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nome, String estado){
        String chave = nome + "-" + estado;
        if (!cidades.containsKey(chave)){
            cidades.put(chave, new Cidade(nome, estado));
        }
        return  cidades.get(chave);
    }

    public static Collection<Cidade> getCidades(){
        return cidades.values();
    }
}
