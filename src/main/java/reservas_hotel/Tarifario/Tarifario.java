package reservas_hotel.Tarifario;

public class Tarifario {
    private static Tarifario instance;

    private float precoAcessoSpa;
    private float descontoHospedeVip;
    private float precoEstacionamento;
    private float precoQuartoStandard;
    private float precoQuartoSuperior;
    private float precoRefeicaoAllInclusive;
    private float precoRefeicaoCafeDaManha;
    private float precoTransfer;

    private Tarifario() {
        precoAcessoSpa = 200.0f;
        descontoHospedeVip = 10.0f;
        precoEstacionamento = 20.0f;
        precoQuartoStandard = 50.0f;
        precoQuartoSuperior = 100.0f;
        precoRefeicaoAllInclusive = 100.0f;
        precoRefeicaoCafeDaManha = 30.0f;
        precoTransfer = 60.0f;
    }

    public static synchronized Tarifario getInstance() {
        if (instance == null) {
            instance = new Tarifario();
        }
        return instance;
    }

    public static void setInstance(Tarifario instance) {
        Tarifario.instance = instance;
    }

    public float getPrecoEstacionamento() {
        return precoEstacionamento;
    }

    public void setPrecoEstacionamento(float precoEstacionamento) {
        this.precoEstacionamento = precoEstacionamento;
    }

    public float getPrecoQuartoStandard() {
        return precoQuartoStandard;
    }

    public void setPrecoQuartoStandard(float precoQuartoStandard) {
        this.precoQuartoStandard = precoQuartoStandard;
    }

    public float getPrecoQuartoSuperior() {
        return precoQuartoSuperior;
    }

    public void setPrecoQuartoSuperior(float precoQuartoSuperior) {
        this.precoQuartoSuperior = precoQuartoSuperior;
    }

    public float getPrecoRefeicaoAllInclusive() {
        return precoRefeicaoAllInclusive;
    }

    public void setPrecoRefeicaoAllInclusive(float precoRefeicaoAllInclusive) {
        this.precoRefeicaoAllInclusive = precoRefeicaoAllInclusive;
    }

    public float getPrecoRefeicaoCafeDaManha() {
        return precoRefeicaoCafeDaManha;
    }

    public void setPrecoRefeicaoCafeDaManha(float precoRefeicaoCafeDaManha) {
        this.precoRefeicaoCafeDaManha = precoRefeicaoCafeDaManha;
    }

    public float getPrecoTransfer() {
        return precoTransfer;
    }

    public void setPrecoTransfer(float precoTransfer) {
        this.precoTransfer = precoTransfer;
    }

    public float getPrecoAcessoSpa() {
        return precoAcessoSpa;
    }

    public void setPrecoAcessoSpa(float precoAcessoSpa) {
        this.precoAcessoSpa = precoAcessoSpa;
    }

    public void setDescontoHospedeVip(float descontoHospedeVip) {
            this.descontoHospedeVip = descontoHospedeVip;

    }

    public float getDescontoHospedeVip() {
        return descontoHospedeVip;
    }

}

