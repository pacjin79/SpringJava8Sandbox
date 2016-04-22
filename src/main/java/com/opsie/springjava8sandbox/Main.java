/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsie.springjava8sandbox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Leo
 */
public class Main {
    
     public static void main(String[] args) {
         ApplicationContext context = //new ClassPathXmlApplicationContext("META-INF/applicationContext.xml")
                 new AnnotationConfigApplicationContext(SpringConfig.class);
         IPersonService personService = context.getBean(PersonService.class);
         Person person = new Person();
         person.save();
         person.getAddress().save();
    }
}
