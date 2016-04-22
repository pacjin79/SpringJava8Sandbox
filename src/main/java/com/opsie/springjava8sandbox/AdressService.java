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
public class AdressService implements IAddressService{

    @Override
    public void saveAddress(Address address) {
        System.out.println("saving address");
    }
    
}
