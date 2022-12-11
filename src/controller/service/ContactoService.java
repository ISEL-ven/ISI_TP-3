package controller.service;

import controller.datamodel.Contacto;

public class ContactoService {
    private Contacto contacto;
    private int idpessoa;
    private String ntelefone;

    public ContactoService(Contacto contacto) {
        this.contacto = contacto;
        this.idpessoa = contacto.getIdpessoa();
        this.ntelefone = contacto.getNtelefone();
    }

    public String validate() {
        String result = "";

        if (!validateIdpessoa()){ result += "idPessoa is not valid\n"; }
        if (!validateNtelefone()){ result += "ntelefone is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateIdpessoa() { // TODO
        return true;
    }
    private boolean validateNtelefone() { // TODO
        return true;
    }
}
