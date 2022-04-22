package br.com.fiap.spring.model.entity.post;

import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;
import br.com.fiap.spring.model.dto.post.CreateUpdatePostDTO;
import br.com.fiap.spring.model.entity.cadastro.Cadastro;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBPOST")
public class Post {

    @Id
    private int id;

    @Column
    private String categoria;

    @Column
    private Date timestamp;

    @Column
    private String fotoURL;

    @Column
    private int numLikes;

    @Column
    private String texto;

    public Post(){}

    public Post(CreateUpdatePostDTO createUpdatePostDTO) {
        this.categoria = createUpdatePostDTO.getCategoria();
        this.timestamp = createUpdatePostDTO.getTimestamp();
        this.fotoURL = createUpdatePostDTO.getFotoURL();
        this.numLikes = createUpdatePostDTO.getNumLikes();
        this.texto = createUpdatePostDTO.getTexto();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}