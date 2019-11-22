package br.com.devmedia.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// Anotação diz ao spring que é uma classe de configuração
@Configuration

// Indica ao framework onde ele deve procurar as classes (pacote base / tudo é escaneado)
@ComponentScan("br.com.devmedia.curso")

// Indica que queremos utilizar o spring mvc
@EnableWebMvc
public class RootConfig {

}
