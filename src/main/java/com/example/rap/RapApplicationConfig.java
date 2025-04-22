package com.example.rap;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.application.ApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletContext;
import java.util.HashMap;

@Component
public class RapApplicationConfig implements ApplicationConfiguration {

    @Autowired
    private ServletContext servletContext;

    private ApplicationRunner runner;

    @PostConstruct
    public void start() {
        runner = new ApplicationRunner(this, servletContext);
        runner.start();
    }

    @PreDestroy
    public void stop() {
        if (runner != null) {
            runner.stop();
        }
    }

    @Override
    public void configure(Application application) {
        application.addEntryPoint("/ui", AppEntryPoint.class, null);
    }
}
