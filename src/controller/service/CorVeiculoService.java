package controller.service;

import controller.datamodel.CorVeiculo;

public class CorVeiculoService {
    private CorVeiculo corVeiculo;
    private int veiculo;
    private String cor;

    public CorVeiculoService(CorVeiculo corVeiculo) {
        this.corVeiculo = corVeiculo;
        this.veiculo = corVeiculo.getVeiculo();
        this.cor = corVeiculo.getColor();
    }

    public String validate() {
        String result = "";

        if (!validateVeiculo()){ result += "veiculo is not valid\n"; }
        if (!validateCor()){ result += "cor is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateVeiculo() { // TODO
        return true;
    }
    private boolean validateCor() { // TODO
        return true;
    }
}
