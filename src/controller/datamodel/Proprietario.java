package controller.datamodel;

import java.time.LocalDate;
public class Proprietario {
    private int idpessoa;
    private LocalDate dtnascimento;

    // Constructors ----------------------------------------------------------------------------------------------------
    public Proprietario(int idpessoa, LocalDate dtnascimento) {
        this.idpessoa = idpessoa;
        this.dtnascimento = dtnascimento;
    }
    public Proprietario(){}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getIdpessoa() { return idpessoa; }
    public void setIdpessoa(int idpessoa) { this.idpessoa = idpessoa; }
    public LocalDate getDtnascimento() { return dtnascimento; }
    public void setDtnascimento(LocalDate dtnascimento) { this.dtnascimento = dtnascimento; }
}
