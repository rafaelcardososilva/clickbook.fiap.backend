package br.com.fiap.spring.model.dto.post;

import br.com.fiap.spring.model.entity.post.Post;

import java.util.Date;

public class PostDTO {
    private int id;

    private String categoria;

    private Date timestamp;

    private String fotoURL;

    private int numLikes;

    private String texto;

    public PostDTO() { }

    public PostDTO(Post post) {
        this.id = post.getId();
        this.categoria = post.getCategoria();
        this.timestamp = post.getTimestamp();
        this.fotoURL = post.getFotoURL();
        this.numLikes = post.getNumLikes();
        this.texto = post.getTexto();
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
