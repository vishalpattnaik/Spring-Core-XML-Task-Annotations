package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

   private Actor actor1;

    public Movie() {
    }

    @Autowired
    public Movie(Actor actor1) {
        this.actor1 = actor1;
       // this.actor2 = actor2;
    }

    public void setActor(Actor actor2) {
        this.actor1 = actor2;
    }

     /*   public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }*/

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                '}';
    }

    /*@Override
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        System.out.println("Application Context = " + context);
    }

    @Override
    public void setBeanName(String beanName)
    {
        System.out.println("Bean name is: "+beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory = "+beanFactory);

    }*/


}
