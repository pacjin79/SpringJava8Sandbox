/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opsie.springjava8sandbox;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Configurable;

/**
 *
 * @author Leo
 */

@Configurable
class Address {
    @Inject
    private IAddressService addressService;
    
    public void save(){
        addressService.saveAddress(this);
    }
}
