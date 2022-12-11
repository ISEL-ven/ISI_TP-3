package controller.service;

import controller.datamodel.TipoVeiculo;
import java.math.BigDecimal;

public class TipoVeiculoService {
    private TipoVeiculo tipoVeiculo;
    private int tipo, nlugares;
    private BigDecimal multiplicador;
    private String designacao;

    public TipoVeiculoService(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
        this.tipo = tipoVeiculo.getTipo();
        this.nlugares = tipoVeiculo.getNlugares();
        this.multiplicador = tipoVeiculo.getMultiplicador();
        this.designacao = tipoVeiculo.getDesignacao();
    }

    public String validate() {
        String result = "";

        if (!validateTipo()){ result += "tipo is not valid\n"; }
        if (!validateNlugares()){ result += "nlugares is not valid\n"; }
        if (!validateMultiplicador()){ result += "multiplicador is not valid\n"; }
        if (!validateDesignacao()){ result += "designacao is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateTipo() {  // TODO
        return true;
    }
    private boolean validateNlugares() {
        // valor positivo e inferior a 8
        return this.nlugares > 0 && this.nlugares < 8;
    }
    private boolean validateMultiplicador() {
        int precision = this.multiplicador.precision();
        return precision == 1;
    }
    private boolean validateDesignacao() {
        // Podera tomar como valores “Normal, XL, Luxo" e talvez Premium
        return this.designacao.equals("Normal") || this.designacao.equals("XL") ||
                this.designacao.equals("Luxo") || this.designacao.equals("Premium");
    }
}
