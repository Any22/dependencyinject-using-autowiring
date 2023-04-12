package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Customer {
    /******************************************************************************************************************
     * This class has dependency of Register to register the customer to an account type
     *  Autowiring the Regsiter property
     *****************************************************************************************************************/
    @Autowired
    private Register register;

    public void registerAccount(){
        if (register.registerToAccount()){
            System.out.println("Customer registered !!");
        } else {
            System.out.println("Customer not registered ");
        }

    }
}

