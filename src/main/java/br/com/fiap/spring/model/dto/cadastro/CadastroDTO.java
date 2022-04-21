package br.com.fiap.spring.model.dto.cadastro;

import br.com.fiap.spring.model.entity.cadastro.Cadastro;

public class CadastroDTO {
    private int id;
    private String nome;
    private String senha;
    private String email;

    public CadastroDTO() { }

    public CadastroDTO(Cadastro cadastro) {
        this.id = cadastro.getId();
        this.nome = cadastro.getNome();
        this.senha = cadastro.getSenha();
        this.email = cadastro.getEmail();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
