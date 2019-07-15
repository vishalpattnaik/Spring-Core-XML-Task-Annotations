package com.stackroute.domain;

import org.springframework.context.annotation.Bean;

public class MainConfig {

    @Bean(name = "actor1")
    public Actor actor1() {

        Actor actor = new Actor();
        actor.setAge(22);
        actor.setGender("male");
        actor.setName("Rahul");
        return actor;

    }

    @Bean(name = "actor2")
    public Actor actor2() {

        Actor actor = new Actor();
        actor.setAge(19);
        actor.setGender("female");
        actor.setName("Simran");
        return actor;

    }

    @Bean(name="movie11")
    public Movie movieObj1() {

        Movie movie = new Movie(actor1(), actor2());
        return movie;

    }


}
