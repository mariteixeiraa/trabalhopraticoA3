package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }
}
