package RevisaoFPOO.AgendaJava;

public class AgendaConsulta {
    String agendamento;
    String horario;
    String data;
    String cliente;
    String veterinario;

    public String getAgendamento() {
        agendamento = data+horario;
        return agendamento;
    }
    public void setAgendamento(String agendamento) {
        this.agendamento = agendamento;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    
}
