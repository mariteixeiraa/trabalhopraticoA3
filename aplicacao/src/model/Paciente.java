package model;

public class Paciente {
    private String id;
    private String nome;
    private String cpf;
    private String telefone;

    public Paciente(String id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }
}

