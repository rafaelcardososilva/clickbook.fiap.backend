package br.com.fiap.spring.controller.post;

import br.com.fiap.spring.model.dto.cadastro.CadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.VerifyCadastroDTO;
import br.com.fiap.spring.model.dto.post.CreateUpdatePostDTO;
import br.com.fiap.spring.model.dto.post.PostDTO;
import br.com.fiap.spring.service.cadastro.CadastroService;
import br.com.fiap.spring.service.post.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"posts"})
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = {"/posts"}, method = RequestMethod.GET)
    public List<PostDTO> buscarPosts() {

        return postService.buscarPosts();
    }

    @GetMapping("{id}")
    public PostDTO buscarPostPorId(@PathVariable int id) {

        return postService.buscarPostPorId(id);
    }

    @RequestMapping(value = {"/novo"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public PostDTO criarPost(@RequestBody CreateUpdatePostDTO createUpdatePostDTO) {

        return postService.criarPost(createUpdatePostDTO);
    }


    @PutMapping("{id}")
    public PostDTO atualizarPost(
            @PathVariable int id,
            @RequestBody CreateUpdatePostDTO createUpdatePostDTO
    ) {

        return postService.atualizar(createUpdatePostDTO, id);
    }

}
