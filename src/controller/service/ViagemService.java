package controller.service;

import controller.datamodel.Viagem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ViagemService {
    private Viagem viagem;
    private int idsistema, classificacao, veiculo, condutor;
    private LocalTime hinicio, hfim;
    private LocalDate dtviagem;
    private BigDecimal valestimado, valfinal, latinicio, longinicio, latfim, longfim;
    private LocalDateTime dtinicio;

    public ViagemService(Viagem viagem) {
        this.viagem = viagem;
        this.idsistema = viagem.getIdsistema();
        this.classificacao = viagem.getClassificacao();
        this.veiculo = viagem.getVeiculo();
        this.condutor = viagem.getCondutor();
        this.hinicio = viagem.getHinicio();
        this.hfim = viagem.getHfim();
        this.dtviagem = viagem.getDtviagem();
        this.valestimado = viagem.getValestimado();
        this.valfinal = viagem.getValfinal();
        this.latinicio = viagem.getLatinicio();
        this.longinicio = viagem.getLonginicio();
        this.latfim = viagem.getLatfim();
        this.longfim = viagem.getLongfim();
        this.dtinicio = viagem.getDtinicio();
    }
    public String validate(){
        String result = "";

        if (!validateHinicio()){ result += "Hinicio is not valid, must be in the \"hh:mm:ss\" format\n"; }
        if (!validateHfim()){ result += "Hfim is not valid, must be in the \"hh:mm:ss\" format and greater than hinicio\n"; }
        if (!validateDtviagem()){ result += "dtviagem is not valid, must be in the \"aaaa-mm-dd\" format\n"; }
        if (!validateValestimado()){ result += "valestimado is not valid\n"; }
        if (!validateValfinal()){ result += "valfinal is not valid\n"; }
        if (!validateLatinicio()){ result += "latinicio is not valid\n"; }
        if (!validateLonginicio()){ result += "longinicio is not valid\n"; }
        if (!validateLatfim()){ result += "latfim is not valid\n"; }
        if (!validateLongfim()){ result += "longfim is not valid\n"; }
        if (!validateClassificacao()){ result += "classificacao is not valid, must be a value between 0 and 5\n"; }
        if (!validateVeiculo()){ result += "veiculo is not valid\n"; }
        if (!validateCondutor()){ result += "condutor is not valid\n"; }
        if (!validateDtinicio()){ result += "dtinicio is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateHinicio(){ // TODO
        // Tem o formato “hh:mm:ss”
        return true;
    }
    private boolean validateHfim() { // TODO
        // Tem o formato “hh:mm:ss”.  Valor superior ahinicio. Podera estar a NULL se a viagem estiver a decorrer.
        return true;
    }
    private boolean validateDtviagem() { // TODO
        // Tem o formato “aaaa-mm-dd"
        return true;
    }
    private boolean validateValestimado() { // TODO
        // Corresponde ao valor estimado em euros. Na BD é do tipo decimal(5,2)
        int scale = this.valestimado.scale();
        int precision = this.valestimado.precision();
        return true;
    }
    private boolean validateValfinal() { // TODO
        // Corresponde ao valor final em euros.  Podera estar a NULL se a viagem estiver a decorrer.
        // Na BD é do tipo decimal(5,2).
        int scale = this.valfinal.scale();
        int precision = this.valfinal.precision();
        return true;
    }
    private boolean validateLatinicio() { // TODO
        // Corresponde a latitude numa coordenada GPS, na BD é do tipo decimal(6,2)
        int scale = this.latinicio.scale();
        int precision = this.latinicio.precision();
        return true;
    }
    private boolean validateLonginicio() { // TODO
        // Corresponde a longitude numa coordenada GPS, na BD é do tipo decimal(6,2)
        int scale = this.longinicio.scale();
        int precision = this.longinicio.precision();
        return true;
    }
    private boolean validateLatfim() { // TODO
        // Corresponde a latitude numa coordenada GPS, devera estar a NULL se hfim tambem o estiver
        // na BD é do tipo decimal(6,2)
        int scale = this.latfim.scale();
        int precision = this.latfim.precision();
        return true;
    }
    private boolean validateLongfim() { // TODO
        // Corresponde a longitude numa coordenada GPS, devera estar a NULL se hfim tambem o estiver
        // na BD é do tipo decimal(6,2)
        int scale = this.longfim.scale();
        int precision = this.longfim.precision();
        return true;
    }
    private boolean validateClassificacao() {
        // Corresponde a classificacao dada pelo cliente apos a viagem. Valores possıveis 1 a 5.
        return this.classificacao > 0 && this.classificacao < 6;
    }
    private boolean validateVeiculo() { // TODO
        // FK referencia de PERIODOACTIVO.{veiculo}
        return true;
    }
    private boolean validateCondutor() { // TODO
        // FK referencia de PERIODOACTIVO.{condutor}
        return true;
    }
    private boolean validateDtinicio() { // TODO
        // FK referencia de PERIODOACTIVO.{dtinicio}
        return true;
    }
}
