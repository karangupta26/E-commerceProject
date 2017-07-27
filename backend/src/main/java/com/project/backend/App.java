package com.project.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.project.configuration.dBConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(dBConfiguration.class);
    	
    }
}
