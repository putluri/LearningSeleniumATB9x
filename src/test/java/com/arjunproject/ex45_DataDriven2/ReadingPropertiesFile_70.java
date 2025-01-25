package com.arjunproject.ex45_DataDriven2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile_70 {
    public static void main(String[] args) throws IOException {

        //Location of properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");

        //Loading properties file
        Properties propertiesobj = new Properties();
        propertiesobj.load(file);

        //Reading data from properties file
        String url = propertiesobj.getProperty("appurl");
        String email = propertiesobj.getProperty("email");
        String pwd = propertiesobj.getProperty("password");
        String orid = propertiesobj.getProperty("orderid");
        String custid = propertiesobj.getProperty("customerid");
        System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);

        //1) Reading all the keys from properties file
         Set<String> keys = propertiesobj.stringPropertyNames();
         System.out.println(keys); //[password, orderid, customerid, appurl, email]

        //2) Reading all the keys from properties file
//        Set<Object> keys2 = propertiesobj.keySet();
//        System.out.println(keys2); //[password, orderid, customerid, appurl, email]


        //2) Reading all the keys from properties file
        Collection<Object> values2 = propertiesobj.values();
        System.out.println(values2); //[password, orderid, customerid, appurl, email] //[abcxyz, 123, 234, https://demo.opencart.com, abc@gmail.com]
        file.close();
    }
}
