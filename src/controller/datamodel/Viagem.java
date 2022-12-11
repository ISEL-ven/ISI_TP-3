package controller.datamodel;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Viagem {
    private int idsistema, classificacao, veiculo, condutor;
    private LocalTime hinicio, hfim;
    private LocalDate dtviagem;
    private BigDecimal valestimado, valfinal, latinicio, longinicio, latfim, longfim;
    private LocalDateTime dtinicio;

    // Constructors ----------------------------------------------------------------------------------------------------
    Viagem(){}

    public Viagem(int idsistema, LocalTime hinicio, LocalTime hfim, LocalDate dtviagem, BigDecimal valestimado,
                  BigDecimal valfinal, BigDecimal latinicio, BigDecimal longinicio, BigDecimal latfim,
                  BigDecimal longfim, int classificacao, int veiculo, int condutor, LocalDateTime dtinicio) {
        this.idsistema = idsistema;
        this.hinicio = hinicio;
        this.hfim = hfim;
        this.dtviagem = dtviagem;
        this.valestimado = valestimado;
        this.valfinal = valfinal;
        this.latinicio = latinicio;
        this.longinicio = longinicio;
        this.latfim = latfim;
        this.longfim = longfim;
        this.classificacao = classificacao;
        this.veiculo = veiculo;
        this.condutor = condutor;
        this.dtinicio = dtinicio;
    }

    // Getters ---------------------------------------------------------------------------------------------------------
    public int getIdsistema() { return idsistema; }
    public LocalTime getHinicio() { return hinicio; }
    public LocalTime getHfim() { return hfim; }
    public LocalDate getDtviagem() { return dtviagem; }
    public BigDecimal getValestimado() { return valestimado; }
    public BigDecimal getValfinal() { return valfinal; }
    public BigDecimal getLatinicio() { return latinicio; }
    public BigDecimal getLonginicio() { return longinicio; }
    public BigDecimal getLatfim() { return latfim; }
    public BigDecimal getLongfim() { return longfim; }
    public int getClassificacao() { return classificacao; }
    public int getVeiculo() { return veiculo; }
    public int getCondutor() {return condutor;}
    public LocalDateTime getDtinicio() { return dtinicio; }

    // Setters ---------------------------------------------------------------------------------------------------------
    public void setIdsistema(int idsistema) { this.idsistema = idsistema; }
    public void setHinicio(LocalTime hinicio) { this.hinicio = hinicio; }
    public void setHfim(LocalTime hfim) { this.hfim = hfim; }
    public void setDtviagem(LocalDate dtviagem) { this.dtviagem = dtviagem; }
    public void setValestimado(BigDecimal valestimado) { this.valestimado = valestimado; }
    public void setValfinal(BigDecimal valfinal) { this.valfinal = valfinal; }
    public void setLatinicio(BigDecimal latinicio) { this.latinicio = latinicio; }
    public void setLonginicio(BigDecimal longinicio) { this.longinicio = longinicio; }
    public void setLatfim(BigDecimal latfim) { this.latfim = latfim; }
    public void setLongfim(BigDecimal longfim) { this.longfim = longfim; }
    public void setClassificacao(int classificacao) { this.classificacao = classificacao; }
    public void setVeiculo(int veiculo) { this.veiculo = veiculo; }
    public void setCondutor(int condutor) { this.condutor = condutor; }
    public void setDtinicio(LocalDateTime dtinicio) { this.dtinicio = dtinicio; }
}
