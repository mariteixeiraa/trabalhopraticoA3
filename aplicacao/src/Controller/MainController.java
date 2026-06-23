package controller;

import model.*;
import service.*;

import java.time.LocalDateTime;

public class MainController {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        AgendamentoService agendamentoService = new AgendamentoService();
        CancelamentoService cancelamentoService = new CancelamentoService();

        Paciente paciente = new Paciente("1", "Maria", "12345678900", "99999-9999");
        Medico medico = new Medico("1", "Dr. João", "Clínico Geral", "CRM123");

        Consulta consulta = new Consulta("1", paciente, medico, LocalDateTime.of(2026, 6, 25, 10, 0));

        boolean agendado = agendamentoService.agendarConsulta(agenda, consulta);
        System.out.println("Consulta agendada? " + agendado);

        boolean cancelado = cancelamentoService.cancelarConsulta(agenda, consulta);
        System.out.println("Consulta cancelada? " + cancelado);
    }
}
