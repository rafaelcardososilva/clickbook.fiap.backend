package br.com.fiap.spring.repository.post;

import br.com.fiap.spring.model.entity.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

//    @Query(value = "SELECT * FROM TB_POST", nativeQuery=true)
//    List<Post> buscarPosts();

    String queryString =  "insert into tb_post(categoria, fotourl, numlikes, texto) values('culinária', 'url', 0, 'Foto de um ovo de pascoa')";
    @Query(value = queryString, nativeQuery=true)
    List<Post> buscarPosts();



}
