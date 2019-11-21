package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"dao","model","config","controller","service"})
public class SpringMVCConfig implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver getJspViewResolver(){
		InternalResourceViewResolver ret=new InternalResourceViewResolver();
		ret.setPrefix("/");
		ret.setSuffix(".jsp");
		ret.setOrder(1);
		return ret;
	}

}


