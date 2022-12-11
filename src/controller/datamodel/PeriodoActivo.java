package controller.datamodel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PeriodoActivo {
    private int veiculo, condutor;
    private LocalDateTime dtinicio, dtfim;
    private BigDecimal lat, lon;  // long is a java reserved word, so we use 'lon'

    // Contructors -----------------------------------------------------------------------------------------------------
    public PeriodoActivo(int veiculo, int condutor, LocalDateTime dtinicio, LocalDateTime dtfim,
                         BigDecimal lat, BigDecimal lon) {
        this.veiculo = veiculo;
        this.condutor = condutor;
        this.dtinicio = dtinicio;
        this.dtfim = dtfim;
        this.lat = lat;
        this.lon = lon;
    }
    public PeriodoActivo() {}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getVeiculo() { return veiculo; }
    public void setVeiculo(int veiculo) { this.veiculo = veiculo; }
    public int getCondutor() { return condutor; }
    public void setCondutor(int condutor) { this.condutor = condutor; }
    public LocalDateTime getDtinicio() { return dtinicio; }
    public void setDtinicio(LocalDateTime dtinicio) { this.dtinicio = dtinicio; }
    public LocalDateTime getDtfim() { return dtfim; }
    public void setDtfim(LocalDateTime dtfim) { this.dtfim = dtfim; }
    public BigDecimal getLat() { return lat; }
    public void setLat(BigDecimal lat) { this.lat = lat; }
    public BigDecimal getLon() { return lon; }
    public void setLon(BigDecimal lon) { this.lon = lon; }
}
