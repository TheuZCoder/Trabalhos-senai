package Exercicos2Semestre;

import java.util.*;

import javax.swing.JOptionPane;

public class ListCarros {
    LinkedList<Carros> carros = new LinkedList();
    Carros carro;

    String marca;
    String modelo;
    String ano;
    String cor;
    String listar = "";

    public void Cadastrar() {
        marca = JOptionPane.showInputDialog("qual a marca do carro?");
        modelo = JOptionPane.showInputDialog("qual modelo do carro?");
        ano = JOptionPane.showInputDialog("qual o ano do carro?");
        cor = JOptionPane.showInputDialog("qual a cor do carro?");

        carros.add(new Carros(marca, modelo, ano, cor));

        JOptionPane.showMessageDialog(null, carros.getLast().getALL());
    }

    public void Exibir() {
        for(Carros carrinho : carros){
            listar += "\n"+carrinho.getALL();
        }
        JOptionPane.showMessageDialog(null, listar);
        listar = "";
    }

    public void Consulta() {
        marca = JOptionPane.showInputDialog("Qual a marca do carro que deseja consultar?");

        for (Carros carrinho : carros){
            if (marca.equalsIgnoreCase(carrinho.getMarca())) {
                listar += "\n"+ carrinho.getALL();
            }
        }

        JOptionPane.showMessageDialog(null, listar);
        listar = "";
    }

    public void Excluir() {
        marca = JOptionPane.showInputDialog(null,"qual marca de carro deseja excluir?" );

    }
}
