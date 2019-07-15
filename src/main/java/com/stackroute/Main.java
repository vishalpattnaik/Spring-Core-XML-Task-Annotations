package com.stackroute;


import com.stackroute.domain.MainConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SuppressWarnings("all")

public class Main {


    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(MainConfig.class);
        Movie mv=context.getBean("movie11", Movie.class);
        System.out.println(mv);
        Movie mv1 = context.getBean("movie22", Movie.class);
        System.out.println(mv1);
        System.out.println(mv==mv1);

    }

}

