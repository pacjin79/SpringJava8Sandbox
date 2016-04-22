/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsie.springjava8sandbox;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Leo
 */
@Configurable(autowire = Autowire.BY_TYPE)
public class Person {
    private String fname;
    private String lname;
    
    private Address address;
    
    @Autowired
    private IPersonService personService;
    
    public Person(){
        this.address = new Address();
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public void save(){
        this.personService.savePerson(this);
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
    
}
