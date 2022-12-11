package controller.datamodel;

public class Veiculo {
    private int id, tipo, ano, proprietario;
    private String matricula, modelo, marca;

    // Constructors ----------------------------------------------------------------------------------------------------
    public Veiculo(int id, int tipo, int ano, int proprietario, String matricula, String modelo, String marca) {
        this.id = id;
        this.tipo = tipo;
        this.ano = ano;
        this.proprietario = proprietario;
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
    }
    public Veiculo(){}

    // Getters and Setters ---------------------------------------------------------------------------------------------
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public int getProprietario() { return proprietario; }
    public void setProprietario(int proprietario) { this.proprietario = proprietario; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}
