package POOExercicio2;

import javax.swing.JOptionPane;

public class buscarpessoa {
    String nome;
    double altura;
    int idade;
    public buscarpessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    
    public buscarpessoa(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void imprimir() {


        JOptionPane.showMessageDialog(null, "Nome:"+nome+" Altura:"+altura+" Idade:"+idade);
    }

}