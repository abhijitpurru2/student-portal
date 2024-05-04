package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class RestAPIApp
{

    public static void main( String[] args )
    {
        SpringApplication.run(RestAPIApp.class, args);
        System.out.println( "Hello World!" );
    }
}
