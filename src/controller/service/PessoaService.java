package controller.service;

import controller.datamodel.Pessoa;

public class PessoaService {
    private Pessoa pessoa;
    private int id, codpostal;
    private String noident, nif, nproprio, apelido, morada, localidade;


    public PessoaService(Pessoa pessoa){
        this.pessoa = pessoa;
        this.id = pessoa.getId();
        this.codpostal = pessoa.getCodpostal();
        this.noident = pessoa.getNoident();
        this.nif = pessoa.getNif();
        this.nproprio = pessoa.getNproprio();
        this.apelido = pessoa.getApelido();
        this.morada = pessoa.getMorada();
        this.localidade = pessoa.getLocalidade();
    }
    public String validate() {
        String result = "";

        if (!validateId()){ result += "id is not valid\n"; }
        if (!validateCodpostal()){ result += "Codpostal is not valid\n"; }
        if (!validateNoident()){ result += "noident is not valid\n"; }
        if (!validateNif()){ result += "nif is not valid\n"; }
        if (!validateNproprio()){ result += "nproprio is not valid\n"; }
        if (!validateApelido()){ result += "apelido is not valid\n"; }
        if (!validateMorada()){ result += "morada is not valid\n"; }
        if (!validateLocalidade()){ result += "localidade is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateId(){ // TODO
        return true;
    }
    private boolean validateCodpostal() {
        // Valor contem 7 digitos que compoem o codigo postal sem hifen
        return this.codpostal >= 1000000 && this.codpostal <= 9999999;
    }
    private boolean validateNoident() {  // TODO
        // Ńumero de identifica̧cao (cart̃ao de cidadao ou passaporte). Chavecandidata
        // Por quest̃oes de simplificacao, optou-se por considerar apenas um dos numeros para identifica̧c̃ao.
        return true;
    }
    private boolean validateNif() { // TODO
        // Numero de identificacao fiscal. chave candidata
        return true;
    }
    private boolean validateNproprio() {  // TODO
        return true;
    }
    private boolean validateApelido() {  // TODO
        return true;
    }
    private boolean validateMorada() { // TODO
        return true;
    }
    private boolean validateLocalidade() { // TODO
        return true;
    }
}
