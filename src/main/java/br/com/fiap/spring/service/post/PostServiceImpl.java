package br.com.fiap.spring.service.post;

import br.com.fiap.spring.model.dto.cadastro.CadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;
import br.com.fiap.spring.model.dto.post.CreateUpdatePostDTO;
import br.com.fiap.spring.model.dto.post.PostDTO;
import br.com.fiap.spring.model.entity.cadastro.Cadastro;
import br.com.fiap.spring.model.entity.post.Post;
import br.com.fiap.spring.repository.cadastro.CadastroRepository;
import br.com.fiap.spring.repository.post.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDTO> buscarPosts() {
        List<Post> postList = postRepository.findAll();
       // List<Post> postList = postRepository.buscarPosts();
        
        return postList.stream()
                .map(PostDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO buscarPostPorId(int id) {
        Post post = findPostById(id);
        return new PostDTO(post);
    }

    @Override
    public PostDTO criarPost(CreateUpdatePostDTO createUpdatePostDTO) {
        Post post = new Post(createUpdatePostDTO);
        Post savedPost = postRepository.save(post);
        return new PostDTO(savedPost);
    }

    @Override
    public PostDTO atualizar(CreateUpdatePostDTO createUpdatePostDTO, int id) {
        Post post = findPostById(id);

        post.setCategoria(createUpdatePostDTO.getCategoria());
        post.setFotoURL(createUpdatePostDTO.getFotoURL());
        post.setTexto(createUpdatePostDTO.getTexto());
        post.setTimestamp(createUpdatePostDTO.getTimestamp());
        post.setNumLikes(createUpdatePostDTO.getNumLikes());


        Post savedPost = postRepository.save(post);
        return new PostDTO(savedPost);
    }


    private Post findPostById(int id) {
        Post post = postRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return post;
    }
}




