package com.example.rap;

import org.eclipse.rap.rwt.engine.RWTServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RapServletConfiguration {

    @Bean
    public ServletRegistrationBean<RWTServlet> rwtServlet() {
        ServletRegistrationBean<RWTServlet> servlet = new ServletRegistrationBean<>(new RWTServlet(), "/ui/*");
        servlet.setName("rwtServlet");
        return servlet;
    }
}
