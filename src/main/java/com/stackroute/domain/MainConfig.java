package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class MainConfig {

    @Bean(name = "actor1")
    public Actor actor1() {

        Actor actor = new Actor("Rahul", "male", 22);
        return actor;

    }

    @Bean(name = "actor2")
    public Actor actor2() {

        Actor actor = new Actor("Simran", "female", 19);
        return actor;

    }

    @Bean({"movie11","movie22"})
    @Scope("prototype")
    public Movie movieObj1() {

        Movie movie = new Movie(actor1());
        return movie;

    }


}
