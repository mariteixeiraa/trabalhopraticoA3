package model;

public class Medico {
    private String id;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico(String id, String nome, String especialidade, String crm) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEspecialidade() { return especialidade; }
    public String getCrm() { return crm; }
}
