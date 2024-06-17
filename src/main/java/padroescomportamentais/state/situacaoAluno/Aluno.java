package padroescomportamentais.state.situacaoAluno;

public class Aluno {

    private String estado;

    public Aluno() {
     this.estado = "Matriculado";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void matricular() {
        if (this.estado.equals("Trancado")) {
            this.estado = "Matriculado";
        }
        else {
            throw new IllegalArgumentException("Erro");
        }
    }

    public void transferir() {
        if (this.estado.equals("Trancado") || this.estado.equals("Matriculado")) {
            this.estado = "Transferido";
        }
        else {
            throw new IllegalArgumentException("Erro");
        }
    }

    public void evadir() {
        if (this.estado.equals("Trancado") || this.estado.equals("Matriculado")) {
            this.estado = "Evadido";
        }
        else {
            throw new IllegalArgumentException("Erro");
        }
    }

    public void jubilar() {
        if (this.estado.equals("Trancado") || this.estado.equals("Matriculado")) {
            this.estado = "Jubilado";
        }
        else {
            throw new IllegalArgumentException("Erro");
        }
    }

    public void formar() {
        if (this.estado.equals("Matriculado")) {
            this.estado = "Formado";
        }
        else {
            throw new IllegalArgumentException("Erro");
        }
    }

    public void trancar() {
        if (this.estado.equals("Matriculado")) {
            this.estado = "Trancado";
        }
        else {
            throw new IllegalArgumentException("Erro");
        }
    }

}

