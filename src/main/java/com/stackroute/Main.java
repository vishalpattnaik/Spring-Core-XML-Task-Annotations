package com.stackroute;


import com.stackroute.domain.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SuppressWarnings("all")

public class Main {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MainConfig.class);
        context.scan("com.stackroute");
        Movie mv=context.getBean("movie", Movie.class);
        System.out.println(mv);

    }

}

