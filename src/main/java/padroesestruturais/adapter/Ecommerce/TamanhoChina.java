package padroesestruturais.adapter.Ecommerce;

public class TamanhoChina implements ITamanho {

    private String tamanhoChina;

    @Override
    public String getTamanho() {
        return this.tamanhoChina;
    }

    @Override
    public void setTamanho(String tamanhoChina) {
        this.tamanhoChina = tamanhoChina;
    }

}
