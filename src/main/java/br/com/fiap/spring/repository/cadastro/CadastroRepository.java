package br.com.fiap.spring.repository.cadastro;

import br.com.fiap.spring.model.entity.cadastro.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    @Query(value = "from Cadastro c where c.nome like %:nome% and where c.senha like %:senha%", nativeQuery = true)
    Cadastro buscarLogin(String nome, String senha);


}
