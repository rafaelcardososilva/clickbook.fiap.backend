package br.com.fiap.spring.model.entity.cadastro;

import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;

import javax.persistence.*;

@Entity
@Table(name = "TBCADASTRO")
public class Cadastro {
    
    private int id;

    @Column
    private String nome;

    @Column
    private String senha;

    @Column
    private String email;

    public Cadastro(){}

    public Cadastro(CreateUpdateCadastroDTO createUpdateCadastroDTO) {
        this.nome = createUpdateCadastroDTO.getNome();
        this.senha = createUpdateCadastroDTO.getSenha();
        this.email = createUpdateCadastroDTO.getEmail();
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