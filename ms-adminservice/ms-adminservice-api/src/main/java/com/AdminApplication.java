package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AdminApplication 
{
    public static void main( String[] args )
    {
    	System.out.println( "Admin!" );
    	SpringApplication.run(AdminApplication.class, args);
    }
}
