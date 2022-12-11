package controller.datamodel;

public class Pessoa {
    private int id, codpostal;
    private String noident, nif, nproprio, apelido, morada, localidade, atrdisc;

    // Constructors ----------------------------------------------------------------------------------------------------
    public Pessoa(int id, int codpostal, String noident, String nif, String nproprio, String apelido, String morada,
                  String localidade, String atrdisc) {
        this.id = id;
        this.codpostal = codpostal;
        this.noident = noident;
        this.nif = nif;
        this.nproprio = nproprio;
        this.apelido = apelido;
        this.morada = morada;
        this.localidade = localidade;
        this.atrdisc = atrdisc;
    }

    public Pessoa(){}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getCodpostal() { return codpostal; }
    public void setCodpostal(int codpostal) { this.codpostal = codpostal; }
    public String getNoident() { return noident; }
    public void setNoident(String noident) { this.noident = noident; }
    public String getNif() { return nif; }
    public void setNif(String nif) { this.nif = nif; }
    public String getNproprio() { return nproprio; }
    public void setNproprio(String nproprio) { this.nproprio = nproprio; }
    public String getApelido() { return apelido; }
    public void setApelido(String apelido) { this.apelido = apelido; }
    public String getMorada() { return morada; }
    public void setMorada(String morada) { this.morada = morada; }
    public String getLocalidade() { return localidade; }
    public void setLocalidade(String localidade) { this.localidade = localidade; }
    public String getAtrdisc() { return atrdisc; }
    public void setAtrdisc(String atrdisc) { this.atrdisc = atrdisc; }
}
