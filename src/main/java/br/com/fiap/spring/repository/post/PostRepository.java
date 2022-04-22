package br.com.fiap.spring.repository.post;

import br.com.fiap.spring.model.entity.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {

//    @Query(value = "SELECT * FROM TB_POST", nativeQuery=true)
//    List<Post> buscarPosts();

    String queryString =  "select * from tb_post ";


    @Query(value = queryString, nativeQuery=true)
    List<Post> buscarPosts();




}
