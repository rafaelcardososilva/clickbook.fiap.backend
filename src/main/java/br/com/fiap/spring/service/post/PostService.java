package br.com.fiap.spring.service.post;

import br.com.fiap.spring.model.dto.cadastro.CadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;
import br.com.fiap.spring.model.dto.post.CreateUpdatePostDTO;
import br.com.fiap.spring.model.dto.post.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> buscarPosts();
    PostDTO buscarPostPorId(int id);
    PostDTO criarPost(CreateUpdatePostDTO createUpdatePostDTO);
    PostDTO atualizar(CreateUpdatePostDTO createUpdatePostDTO, int id);

}
