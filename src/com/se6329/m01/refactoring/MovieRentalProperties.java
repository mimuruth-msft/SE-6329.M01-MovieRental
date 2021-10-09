package com.se6329.m01.refactoring;

import java.util.Properties;
import java.io.FileReader;

public class MovieRentalProperties {
    
    private static final String PROPERTY_FILENAME = "Constants.properties";

    private static Properties properties;

    private MovieRentalProperties(){}

    public static Properties getProperties(){
        if (properties == null){
            properties = new Properties();
            try{
                properties.load(new FileReader(PROPERTY_FILENAME));
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
