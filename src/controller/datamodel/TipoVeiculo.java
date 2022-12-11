package controller.datamodel;

import java.math.BigDecimal;

public class TipoVeiculo {
    private int tipo, nlugares;
    private BigDecimal multiplicador;
    private String designacao;

    // Constructors ----------------------------------------------------------------------------------------------------
    public TipoVeiculo(int tipo, int nlugares, BigDecimal multiplicador, String designacao) {
        this.tipo = tipo;
        this.nlugares = nlugares;
        this.multiplicador = multiplicador;
        this.designacao = designacao;
    }
    public TipoVeiculo(){}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }
    public int getNlugares() { return nlugares; }
    public void setNlugares(int nlugares) { this.nlugares = nlugares; }
    public BigDecimal getMultiplicador() { return multiplicador; }
    public void setMultiplicador(BigDecimal multiplicador) { this.multiplicador = multiplicador; }
    public String getDesignacao() { return designacao; }
    public void setDesignacao(String designacao) { this.designacao = designacao; }
}