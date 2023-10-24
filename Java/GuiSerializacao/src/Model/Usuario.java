package Model;

import java.io.Serializable;

/**
 * Usuario
 */
public class Usuario implements Serializable{                       

    private String nome;
    private int idade;

    //construtor

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //gets and setter
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}


//gets and setter

