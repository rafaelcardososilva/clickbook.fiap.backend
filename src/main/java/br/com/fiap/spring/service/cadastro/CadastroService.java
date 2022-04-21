package br.com.fiap.spring.service.cadastro;

import br.com.fiap.spring.model.dto.cadastro.CadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;

public interface CadastroService {

    CadastroDTO buscarCadastro(String nome, String senha);
    CadastroDTO criarCadastro(CreateUpdateCadastroDTO createUpdateCadastroDTO);
    CadastroDTO atualizar(CreateUpdateCadastroDTO stockCreateUpdateDTO, int id);
    CadastroDTO buscarPorId(int id);

}
