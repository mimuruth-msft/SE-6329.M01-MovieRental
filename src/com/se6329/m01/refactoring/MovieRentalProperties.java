package com.se6329.m01.refactoring;

import java.util.Properties;
import java.io.FileReader;

public class MovieRentalProperties {
    
    private static final String PROPERTY_FILENAME = "Constants.properties";

    private static Properties properties;

    private MovieRentalProperties(){}

    public static Properties getProperties(){
        if (propertes == null){
            properties = new Properties();
            properties.load(new FileReader(PROPERTY_FILENAME));
        }
        return properties;
    }
}
