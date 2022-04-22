package br.com.fiap.spring.repository.cadastro;

import br.com.fiap.spring.model.entity.cadastro.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    String queryString = "SELECT nome, senha FROM TBCADASTRO WHERE NOME = %:nome% and SENHA = %:senha%";
    
    @Query(value = queryString, nativeQuery = true)
    Cadastro buscarLogin(String nome, String senha);


}
