package controller.datamodel;

import java.time.LocalDate;

public class Condutor {
    private int idpessoa;
    private String nconducao;
    private LocalDate dtnascimento;

    // Constructors ----------------------------------------------------------------------------------------------------
    public Condutor(int idpessoa, String nconducao, LocalDate dtnascimento) {
        this.idpessoa = idpessoa;
        this.nconducao = nconducao;
        this.dtnascimento = dtnascimento;
    }
    public Condutor() {}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getIdpessoa() { return idpessoa; }
    public void setIdpessoa(int idpessoa) { this.idpessoa = idpessoa; }
    public String getNconducao() { return nconducao; }
    public void setNconducao(String nconducao) { this.nconducao = nconducao; }
    public LocalDate getDtnascimento() { return dtnascimento; }
    public void setDtnascimento(LocalDate dtnascimento) { this.dtnascimento = dtnascimento; }
}
