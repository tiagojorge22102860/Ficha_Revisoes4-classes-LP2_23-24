public class Pessoa {
    String nome;
    String apelido;
    Apartamento morada;

    public Pessoa(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }

    public Pessoa(String nome, String apelido, Apartamento morada) {
        this.nome = nome;
        this.apelido = apelido;
        this.morada = morada;
    }

    @Override
    public String toString() {
        if (morada == null){
            return nome+" "+apelido+" | Morada: desconhecida";
        }
        return nome+" "+apelido+" | Morada: "+ morada.nomeRua+" "+morada.nrPorta+", "+morada.localidade+", "+ morada.pais;
    }
}
