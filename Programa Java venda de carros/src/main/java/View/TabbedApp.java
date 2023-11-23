package View;

import javax.swing.JTabbedPane;

import Model.Login;


public class TabbedApp extends JTabbedPane {
    JanelaCarros painelCarros;
    JanelaPessoas painelPessoas = new JanelaPessoas();
    JanelaVendas painelVendas;

    public TabbedApp(Login logado) {
        super();
        painelCarros = new JanelaCarros(logado);
        painelVendas = new JanelaVendas(logado);
        this.add("Carros", painelCarros);
        this.add("Pessoas", painelPessoas);
        this.add("Venda", painelVendas);
    }
}