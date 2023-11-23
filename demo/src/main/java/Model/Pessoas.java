package Model;

public class Pessoas {
    private String nome;
    private String endereco;
    private String numtele;
    private String cpf;

    //métodos
    public Pessoas(String nome, String endereco, String numtele, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.numtele = numtele;
        this.cpf = cpf;
    }


    //gets and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }
    public String getNumtele() {
        return numtele;
    }
    public void setNumtele(String numtele) {
        this.numtele = numtele;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
