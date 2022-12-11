package controller.service;

import controller.datamodel.PeriodoActivo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PeriodoActivoService {
    private PeriodoActivo periodoActivo;
    private int veiculo, condutor;
    private LocalDateTime dtinicio, dtfim;
    private BigDecimal lat, lon;

    public PeriodoActivoService(PeriodoActivo periodoActivo) {
        this.periodoActivo = periodoActivo;
        this.veiculo = periodoActivo.getVeiculo();
        this.condutor = periodoActivo.getCondutor();
        this.dtinicio = periodoActivo.getDtinicio();
        this.dtfim = periodoActivo.getDtfim();
        this.lat = periodoActivo.getLat();
        this.lon = periodoActivo.getLon();
    }
    public String validate(){
        String result = "";

        if (!validateVeiculo()){ result += "veiculo is not valid\n"; }
        if (!validateCondutor()){ result += "condutor is not valid\n"; }
        if (!validateDtinicio()){ result += "dtinicio is not valid\n"; }
        if (!validateDtfim()){ result += "dtfim is not valid\n"; }
        if (!validateLat()){ result += "lat is not valid\n"; }
        if (!validateLon()){ result += "long is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateVeiculo() { // TODO
        return true;
    }
    private boolean validateCondutor() { // TODO
        return true;
    }
    private boolean validateDtinicio() { // TODO
        return true;
    }
    private boolean validateDtfim() { // TODO
        return true;
    }
    private boolean validateLat() {  // TODO
        int precision = lat.precision();
        int scale = lat.scale();
        return true;
    }
    private boolean validateLon() {  // TODO
        int precision = lon.precision();
        int scale = lon.scale();
        return true;
    }
}
