package thymeleafday1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // allow pages under the css folder and home page to be accessible to every on
                .antMatchers("/", "/index/**","/login", "/register", "/webjars/**", "/webjars/","/hello","/img/**","/css/**","/uploads/**").permitAll()
                .antMatchers("/css/*", "/images/*", "/js/*","/", "/*").permitAll();
    }

}
