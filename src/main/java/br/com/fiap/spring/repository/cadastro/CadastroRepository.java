package br.com.fiap.spring.repository.cadastro;

import br.com.fiap.spring.model.entity.cadastro.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    @Query("SELECT c FROM TBCADASTRO c WHERE c.nome = :nome and c.senha = :senha")
    Cadastro buscarLogin(@Param("nome") String nome,
                         @Param("senha") String senha);

}
