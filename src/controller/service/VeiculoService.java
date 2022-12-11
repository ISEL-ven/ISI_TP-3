package controller.service;

import controller.datamodel.Veiculo;

public class VeiculoService {
    private Veiculo veiculo;
    private int id, tipo, ano, proprietario;
    private String matricula, modelo, marca;

    public VeiculoService(Veiculo veiculo){
        this.veiculo = veiculo;
        this.id = veiculo.getId();
        this.tipo = veiculo.getTipo();
        this.ano = veiculo.getAno();
        this.proprietario = veiculo.getProprietario();
        this.matricula = veiculo.getMatricula();
        this.modelo = veiculo.getModelo();
        this.marca = veiculo.getMarca();
    }
    public String validate() {
        String result = "";
        if (!validateTipo()) { result += "tipo is not valid\n"; }
        if (!validateAno()) { result += "ano is not valid\n"; }
        if (!validateProprietario()) { result += "proprietario is not valid\n"; }
        if (!validateMatricula()) { result += "matricula is not valid\n"; }
        if (!validateModelo()) { result += "modelo is not valid\n"; }
        if (!validateMarca()) { result += "marca is not valid\n"; }
        else { result += "All validated\n"; }

        return result;
    }
    private boolean validateTipo() {  // TODO
        // FK referencia a TIPOVEICULO.{tipo}
        return true;
    }
    private boolean validateAno() {  // TODO
        // A idade do veıculo deve ser inferior a 5 (inclusive) a data do registo
        return true;
    }
    private boolean validateProprietario() {  // TODO
        // FK  referencia a PROPRIETARIO.{idpessoa}. Cadaproprietario tem no maximo 20 veıculos.
        return true;
    }
    private boolean validateMatricula() {  // TODO
        // Tem o formato “CCDDCC” ou “DDCCDD”, onde C representa uma letra e D um dıgito.  Chave candidata
        return true;
    }
    private boolean validateModelo() {  // TODO
        return true;
    }
    private boolean validateMarca() {  // TODO
        return true;
    }
}
