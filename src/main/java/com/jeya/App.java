package com.jeya;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        System.out.println( "Hello World!" );
        
        logger.info("App Starts!!");
        
        
    }
}
