package service;

import model.Agenda;
import model.Consulta;

public class CancelamentoService {

    public boolean cancelarConsulta(Agenda agenda, Consulta consulta) {
        if (agenda.listarConsultas().contains(consulta)) {
            agenda.removerConsulta(consulta);
            return true;
        }
        return false;
    }
}
