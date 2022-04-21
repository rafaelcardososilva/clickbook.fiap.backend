package br.com.fiap.spring.controller.cadastro;

import br.com.fiap.spring.model.dto.cadastro.CadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.CreateUpdateCadastroDTO;
import br.com.fiap.spring.model.dto.cadastro.VerifyCadastroDTO;
import br.com.fiap.spring.service.cadastro.CadastroService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"cadastros"})
public class CadastroController {

    private CadastroService cadastroService;

    public CadastroController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @RequestMapping(value = {"/buscar"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public CadastroDTO buscarCadastro(@RequestBody VerifyCadastroDTO verifyCadastroDTO) {

        return cadastroService.buscarCadastro(verifyCadastroDTO.getNome(), verifyCadastroDTO.getSenha());
    }

    @RequestMapping(value = {"/novo"}, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public CadastroDTO criarCadastro(@RequestBody CreateUpdateCadastroDTO createUpdateCadastroDTO) {

        return cadastroService.criarCadastro(createUpdateCadastroDTO);
    }


    @PutMapping("{id}")
    public CadastroDTO atualizarCadastro(
            @PathVariable int id,
            @RequestBody CreateUpdateCadastroDTO createUpdateCadastroDTO
    ) {

        return cadastroService.atualizar(createUpdateCadastroDTO, id);
    }

}
