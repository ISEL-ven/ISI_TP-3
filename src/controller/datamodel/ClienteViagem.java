package controller.datamodel;

public class ClienteViagem {
    private int idpessoa, viagem;

    // Constructors ----------------------------------------------------------------------------------------------------
    public ClienteViagem(int idpessoa, int viagem) {
        this.idpessoa = idpessoa;
        this.viagem = viagem;
    }
    public ClienteViagem() {}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getIdpessoa() { return idpessoa; }
    public void setIdpessoa(int idpessoa) { this.idpessoa = idpessoa; }
    public int getViagem() { return viagem; }
    public void setViagem(int viagem) { this.viagem = viagem; }
}
