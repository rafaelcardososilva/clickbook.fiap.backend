package br.com.fiap.spring.configuration;

import br.com.fiap.spring.validator.cadastro.CadastroValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public CadastroValidator cadastroValidator(){
        return new CadastroValidator();
    }

}
