package padroescriacao.builder;

public class ProdutoBuilder {

    private Produto produto;

    public ProdutoBuilder() {
        produto = new Produto();
    }

    public Produto build() {
        if (produto.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (produto.getPreco() == 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        return produto;
    }

    public ProdutoBuilder setNome(String nome) {
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder setModelo(String modelo) {
        produto.setModelo(modelo);
        return this;
    }

    public ProdutoBuilder setCor(String cor) {
        produto.setCor(cor);
        return this;
    }

    public ProdutoBuilder setPreco(double preco) {
        produto.setPreco(preco);
        return this;
    }

    public ProdutoBuilder setCodigoBarras(String codigoBarras) {
        produto.setCodigoBarras(codigoBarras);
        return this;
    }

    public ProdutoBuilder setFabricante(String fabricante) {
        produto.setFabricante(fabricante);
        return this;
    }

    public ProdutoBuilder setPeso(double peso) {
        produto.setPeso(peso);
        return this;
    }

    public ProdutoBuilder setDimensoes(String dimensoes) {
        produto.setDimensoes(dimensoes);
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        produto.setDescricao(descricao);
        return this;
    }

}
