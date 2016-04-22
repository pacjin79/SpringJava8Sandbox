package com.opsie.springjava8sandbox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author Leo
 */
@Configuration
@ComponentScan(basePackages = {
    "com.opsie.springjava8sandbox"
})
@ImportResource("classpath:META-INF/applicationContext.xml")
public class SpringConfig {

}
