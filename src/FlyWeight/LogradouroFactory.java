package FlyWeight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LogradouroFactory {

    private static final Map<String, Logradouro> logradouros = new HashMap<>();

    public static Logradouro getLogradouro(String cep, String nome, Cidade cidade){
        if (!logradouros.containsKey(cep)){
            logradouros.put(cep, new Logradouro(cep, nome, cidade));
        }
        return logradouros.get(cep);
    }

    public static Collection<Logradouro> getLogradouros(){
        return logradouros.values();
    }
}
