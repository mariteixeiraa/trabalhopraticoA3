package service;

import model.Agenda;
import model.Consulta;

public class AgendamentoService {

    public boolean agendarConsulta(Agenda agenda, Consulta consulta) {
        for (Consulta c : agenda.listarConsultas()) {
            if (c.getDataHora().equals(consulta.getDataHora()) &&
                    c.getMedico().getId().equals(consulta.getMedico().getId())) {
                return false; // conflito de horário
            }
        }
        agenda.adicionarConsulta(consulta);
        return true;
    }
}
