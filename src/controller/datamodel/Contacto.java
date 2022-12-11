package controller.datamodel;

public class Contacto {
    private int idpessoa;
    private String ntelefone;

    // Constructors ----------------------------------------------------------------------------------------------------
    public Contacto(int idpessoa, String ntelefone) {
        this.idpessoa = idpessoa;
        this.ntelefone = ntelefone;
    }
    public Contacto() {}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getIdpessoa() { return idpessoa; }
    public void setIdpessoa(int idpessoa) { this.idpessoa = idpessoa; }
    public String getNtelefone() { return ntelefone; }
    public void setNtelefone(String ntelefone) { this.ntelefone = ntelefone; }
}
