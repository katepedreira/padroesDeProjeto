package padroesestruturais.adapter.Ecommerce;

public class Calçado {

    ITamanho tamanho;
    TamanhoAdapter persistencia;

    public Calçado() {
        tamanho = new TamanhoChina();
        persistencia = new TamanhoAdapter(tamanho);
    }

    public void setTamanho(String tamanhoChina) {
        tamanho.setTamanho(tamanhoChina);
        persistencia.salvarTamanho();
    }

    public String getTamanho() {
        return persistencia.recuperarTamanho();
    }

    public String getTamanhoBrasil() {
        return persistencia.getTamanhoBrasil();
    }

}
