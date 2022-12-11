package controller.datamodel;

public class CondHabilitado {
    private int condutor, veiculo;

    // Constructors ----------------------------------------------------------------------------------------------------
    public CondHabilitado(int condutor, int veiculo) {
        this.condutor = condutor;
        this.veiculo = veiculo;
    }
    public CondHabilitado() {}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getCondutor() { return condutor; }
    public void setCondutor(int condutor) { this.condutor = condutor; }
    public int getVeiculo() { return veiculo; }
    public void setVeiculo(int veiculo) { this.veiculo = veiculo; }
}
