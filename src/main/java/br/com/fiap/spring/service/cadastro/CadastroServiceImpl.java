package br.com.fiap.spring.service.cadastro;

import br.com.fiap.spring.model.dto.cadastro.CadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;
import br.com.fiap.spring.model.entity.cadastro.Cadastro;
import br.com.fiap.spring.repository.cadastro.CadastroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CadastroServiceImpl implements CadastroService {

    private final CadastroRepository cadastroRepository;

    public CadastroServiceImpl(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    @Override
    public CadastroDTO buscarCadastro(String nome, String senha) {
        Cadastro cadastro = new Cadastro();
        if (nome != null && senha != null) {
            cadastro = cadastroRepository.buscarLogin(nome, senha);
        }
        return new CadastroDTO(cadastro);
    }

    @Override
    public CadastroDTO criarCadastro(CreateUpdateCadastroDTO createUpdateCadastroDTO) {
        Cadastro cadastro = new Cadastro(createUpdateCadastroDTO);
        Cadastro savedCadastro = cadastroRepository.save(cadastro);
        return new CadastroDTO(savedCadastro);
    }

    @Override
    public CadastroDTO atualizar(CreateUpdateCadastroDTO stockCreateUpdateDTO, int id) {
        Cadastro cadastro = findCadastroById(id);

        cadastro.setNome(stockCreateUpdateDTO.getNome());
        cadastro.setSenha(stockCreateUpdateDTO.getSenha());
        cadastro.setEmail(stockCreateUpdateDTO.getEmail());

        Cadastro savedCadastro = cadastroRepository.save(cadastro);
        return new CadastroDTO(savedCadastro);
    }

    @Override
    public CadastroDTO buscarPorId(int id) {
        Cadastro cadastro = findCadastroById(id);
        return new CadastroDTO(cadastro);
    }
    private Cadastro findCadastroById(int id) {
        Cadastro cadastro = cadastroRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return cadastro;
    }
}




