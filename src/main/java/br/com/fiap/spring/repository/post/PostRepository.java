package br.com.fiap.spring.repository.post;

import br.com.fiap.spring.model.entity.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    String queryString =  "SELECT * FROM tbPost";

    @Query(value = queryString, nativeQuery=true)
    List<Post> buscarPosts();
}
