package com.builder._1_SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 * 
 */
//NoSuchBeanDefinitionException
//IllegalStateException


public class Application 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	//Samsung s7 = new Samsung();
    	Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
