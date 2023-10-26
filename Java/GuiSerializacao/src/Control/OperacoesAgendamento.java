package Control;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Agenda;

public class OperacoesAgendamento {

    // atributos
    private List<Agenda> agendas;
    private DefaultTableModel tableModel;

    public OperacoesAgendamento(List<Agenda> agendas, DefaultTableModel tableModel, JTable table) {
        this.agendas = agendas;
        this.tableModel = tableModel;
    }
    
    // métodos do CRUD
    public void agendarAgenda(String data, String hora, String usuario, String descrição) {
        Agenda agenda = new Agenda(data, hora, usuario, descrição);
        agendas.add(agenda);
        atualizarAgenda();
    }

    public void atualizarAgenda(int linhaSelecionada, String data, String hora, String usuario, String descricao) {
        if (linhaSelecionada != -1) {

            Agenda agenda = new Agenda(data, hora, usuario, descricao);
            agendas.set(linhaSelecionada, agenda);
            atualizarAgenda();
        }
    }

    public void apagarAgenda(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendas.remove(linhaSelecionada);
            atualizarAgenda();
        }
    }

    public void salvarAgenda() {
        Serializacao.serializar2("dados2.txt", agendas);
    }

    private void atualizarAgenda() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModel.addRow(
                    new Object[] { agenda.getData(), agenda.getHora(), agenda.getUsuario(), agenda.getDescricao() });
        }
    }
}
