package com.stackroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post Process Before Initialization");
        return null;

    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post Process After Initialization");
        return null;
    }



    }
