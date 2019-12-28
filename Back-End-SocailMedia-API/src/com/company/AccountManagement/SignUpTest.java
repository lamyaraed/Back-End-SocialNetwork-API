package com.company.AccountManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignUpTest {

    @Test
    void signUp() {

        //  String country, String Account_type
        String name = "AyaAmr";
        String Password = "123456789";
        int age = 20;
        String Email = "xxxx@gmail.com";
        String Gender = "Female";
        String firstname = "aya";
        String lastname = "amr";
        String country = "Egypt";
        String accounttype = "Premium";

        Account myAccount = new Account();
        boolean tst= myAccount.SignUp(name,firstname,lastname,Email,Password,age,Gender,country,accounttype);
        assertEquals(true,tst);
    }
}