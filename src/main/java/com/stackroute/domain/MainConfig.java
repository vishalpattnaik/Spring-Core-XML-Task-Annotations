package com.stackroute.domain;

import com.stackroute.demo.BeanLifeCycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {

    @Bean(name = "actor1")
    public Actor actor1() {

       return new Actor("Rahul", "male", 22);

    }

//    @Bean(name = "actor2")
//    public Actor actor2() {
//
//        Actor actor = new Actor("Simran", "female", 19);
//        return actor;
//
//    }

    @Bean
    public Movie movie() {

        Movie movie = new Movie(actor1());
        return movie;

    }

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public BeanLifeCycleDemoBean beanLifeCycleDemoBean()
    {
        BeanLifeCycleDemoBean beanLifecycleDemoBean=new BeanLifeCycleDemoBean();
        return beanLifecycleDemoBean;

    }

}
