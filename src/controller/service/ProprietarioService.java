package controller.service;

import controller.datamodel.Proprietario;

import java.time.LocalDate;

public class ProprietarioService {
    private Proprietario proprietario;
    private int idpessoa;
    private LocalDate dtnascimento;

    public ProprietarioService(Proprietario proprietario) {
        this.proprietario = proprietario;
        this.idpessoa = proprietario.getIdpessoa();
        this.dtnascimento = proprietario.getDtnascimento();
    }
    public String validate() {
        String result = "";

        if (!validateIdPessoa()){ result += "idPessoa is not valid\n"; }
        if (!validateDtnascimento()){ result += "Dtnascimento is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateIdPessoa() { // TODO
        return true;
    }
    private boolean validateDtnascimento() { // TODO
        return true;
    }
}
