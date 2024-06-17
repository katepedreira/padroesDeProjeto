package padroesestruturais.adapter.Ecommerce;

public class TamanhoAdapter extends TamanhoBrasil {

    private ITamanho tamanhoChina;

    public TamanhoAdapter(ITamanho tamanhoChina) {
        this.tamanhoChina = tamanhoChina;
    }

    public String recuperarTamanho() {
        if (this.getTamanhoBrasil().equals("BR34"))
            tamanhoChina.setTamanho("CH36");
        else
            if (this.getTamanhoBrasil().equals("BR35"))
                tamanhoChina.setTamanho("CH37");
            else
                if (this.getTamanhoBrasil().equals("BR36"))
                    tamanhoChina.setTamanho("CH38");
                else
                    if (this.getTamanhoBrasil().equals("BR37"))
                        tamanhoChina.setTamanho("CH39");
                    else
                        if (this.getTamanhoBrasil().equals("BR38"))
                            tamanhoChina.setTamanho("CH40");
                        else
                            if (this.getTamanhoBrasil().equals("BR39"))
                                tamanhoChina.setTamanho("CH41");
                            else
                                if (this.getTamanhoBrasil().equals("BR40"))
                                    tamanhoChina.setTamanho("CH42");

        return tamanhoChina.getTamanho();
    }


    public void salvarTamanho() {
        if (tamanhoChina.getTamanho().equals("CH36"))
            this.setTamanhoBrasil("BR34");
        else
            if (tamanhoChina.getTamanho().equals("CH37"))
                this.setTamanhoBrasil("BR35");
            else
                if (tamanhoChina.getTamanho().equals("CH38"))
                    this.setTamanhoBrasil("BR36");
                else
                    if (tamanhoChina.getTamanho().equals("CH38"))
                        this.setTamanhoBrasil("BR36");
                    else
                        if (tamanhoChina.getTamanho().equals("CH39"))
                            this.setTamanhoBrasil("BR37");
                        else
                            if (tamanhoChina.getTamanho().equals("CH40"))
                                this.setTamanhoBrasil("BR38");
                            else
                                if (tamanhoChina.getTamanho().equals("CH41"))
                                    this.setTamanhoBrasil("BR39");
                                else
                                    if (tamanhoChina.getTamanho().equals("CH42"))
                                        this.setTamanhoBrasil("BR40");
                                    else {
                                        throw new IllegalArgumentException("Tamanho inexistente");
                                    }

    }
}
