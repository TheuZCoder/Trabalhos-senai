package RevisaoFPOO.Cadastro;

public abstract class Animais{

    String porte;
    double peso;
    String proprietario;
    String nome;
    //métodos

    public Animais(String porte, double peso, String proprietario, String nome, String especie) {
        this.porte = porte;
        this.peso = peso;
        this.proprietario = proprietario;
        this.nome = nome;
    }

    public String getPorte() {
        return this.porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}