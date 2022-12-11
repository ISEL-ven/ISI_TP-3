package controller.datamodel;

public class CorVeiculo {
    private int veiculo;
    private String color;

    // Constructors ----------------------------------------------------------------------------------------------------
    public CorVeiculo(int veiculo, String color) {
        this.veiculo = veiculo;
        this.color = color;
    }
    public CorVeiculo() {}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getVeiculo() { return veiculo; }
    public void setVeiculo(int veiculo) { this.veiculo = veiculo; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
