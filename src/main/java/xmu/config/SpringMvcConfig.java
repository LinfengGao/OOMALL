package xmu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"xmu.controller", "xmu.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
