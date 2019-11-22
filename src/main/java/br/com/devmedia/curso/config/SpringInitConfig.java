package br.com.devmedia.curso.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Classe Raiz 
		// Quando o servidor iniciar essa classe será a primeira
		return new Class[] {RootConfig.class};
	}

	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Quem é a classe que contem a parte de servlets para o spring
		return new Class[] {SpringMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Mapeamento dos nossos Servlets, a partir da '/' 
		return new String[] {"/"};
	}

}
