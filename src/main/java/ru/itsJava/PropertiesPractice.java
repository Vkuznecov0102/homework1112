package ru.itsJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPractice {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/app.properties");

        Properties properties = new Properties();
        properties.load(new FileInputStream(file));

        ClassLoader classLoader = PropertiesPractice.class.getClassLoader();
        InputStream stream = classLoader.getResourceAsStream("app.properties");

        Properties propFromApp = new Properties();
        propFromApp.load(stream);
        System.out.println("propFromApp.getProperty(\"name\") = " + propFromApp.getProperty("name"));
        System.out.println("propFromApp.getProperty(\"nickname\") = " + propFromApp.getProperty("nickname"));
    }
}
