package padroesestruturais.proxy.Streaming;

public class Usuario {
    private int idade;
    private String idUsuario;

    public Usuario(String idUsuario, int idade) {
        this.idUsuario = idUsuario;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}

