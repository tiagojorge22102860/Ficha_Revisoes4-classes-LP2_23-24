import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    static Pessoa[] novosAmigos() {
        Pessoa pessoa1 = new Pessoa("josevaldo", "Silva");
        Apartamento morada = new Apartamento("rua das Flores", 12, "Biscoitos", "Portugal");
        Pessoa pessoa2 = new Pessoa("Manuel", "Gomes", morada);

        Pessoa[] amigos = new Pessoa[]{pessoa1, pessoa2};
        return amigos;
    }

    static HashMap<String, ArrayList<Pessoa>> agruparVizinhos(Pessoa[] pessoas) {

        HashMap<String, ArrayList<Pessoa>> morada = new HashMap<>();


        for (Pessoa pessoa : pessoas) {

            String endereco = pessoa.morada.nomeRua;
            if (!morada.containsKey(endereco)) {
                morada.put(endereco, new ArrayList<>());
            }
            morada.get(endereco).add(pessoa);

        }
        return morada;
    }

    public static void main(String[] args) {
        for (Pessoa pessoa : novosAmigos()) {
            System.out.println(pessoa.toString());
        }


    }
}