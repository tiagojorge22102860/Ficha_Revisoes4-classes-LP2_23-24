public class Apartamento {

    String nomeRua;
    int nrPorta;
    String localidade;
    String pais;

    public Apartamento(String nomeRua, int nrPorta, String localidade, String pais) {
        this.nomeRua = nomeRua;
        this.nrPorta = nrPorta;
        this.localidade = localidade;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nomeRua+" "+nrPorta+", "+localidade+", "+pais;
    }
}
