/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsie.springjava8sandbox;

import org.springframework.stereotype.Service;

/**
 *
 * @author Leo
 */
@Service
public class PersonService implements IPersonService {
    
    @Override
    public void savePerson(Person person){
      System.out.println("called save person");
    }
}
