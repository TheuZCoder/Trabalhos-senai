package Model;

import java.io.Serializable;

public class Agenda implements Serializable{
    //atributos
    private String data;
    private String hora;
    private String usuario;
    private String descricao;


    //gerando o construtor
 public Agenda(String data, String hora, String usuario, String descricao) {
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.descricao = descricao;
    }

    public Agenda(String data2, String hora2, String usuario2, int idadeInt) {
}

    //gerando os getters and setters
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void add(Agenda agendas) {
    }

    public void set(int linhaSelecionada, String usuario2) {
    }
   

    
}
