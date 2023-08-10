package Exercicos2Semestre;

import java.util.*;

import javax.swing.JOptionPane;

public class ListCarros {
    List<Carros> carros = new ArrayList<>();
    Carros carro;

    String marca;
    String modelo;
    String ano;
    String cor;

    public void Cadastrar() {
        marca = JOptionPane.showInputDialog("qual a marca do carro?");
        modelo = JOptionPane.showInputDialog("qual modelo do carro?");
        ano = JOptionPane.showInputDialog("qual o ano do carro?");
        cor = JOptionPane.showInputDialog("qual a cor do carro?");

        carros.add(new Carros(marca, modelo, ano, cor));
    }

    public void Exibir() {
        for(Carros carrinho : carros){
            JOptionPane.showMessageDialog(null, carrinho);
        }
    }

    public void Consulta() {
        marca = JOptionPane.showInputDialog("Qual a marca do carro que deseja consultar?");

        for (Carros carrinho : carros){

            if (marca.toUpperCase().toLowerCase() == carro.getMarca()) {
                JOptionPane.showMessageDialog(null, carrinho);
            }
        }
    }

    public void Excluir() {

    }
}
