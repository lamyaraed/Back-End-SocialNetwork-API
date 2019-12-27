package com.company.AccountManagement;

import com.company.UserProfile.User;
import com.company.UserProfile.UserDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignUpTest {

    @Test
    void getPersonalInfo() {

        //  String country, String Account_type
        String name = "Lamya";
        String Password = "123456789";
        int age = 20;
        String Email = "xxxx@gmail.com";
        String Gender = "Female";
        String firstname = "aya";
        String lastname = "amr";
        String country = "Egypt";
        String accounttype = "Premium";

        SignUp test = new SignUp();//6+8=14
        boolean tst= test.getPersonalInfo(name,firstname,lastname,Email,Password,age,Gender,country,accounttype);
        assertEquals(true,tst);
    }

    @Test
    void activate() {
    }

    @Test
    void verifyAccount() {
    }

    @Test
    void checkEmail() {

    }

    @Test
    void checkUserName() {
    }

    @Test
    void checkPassword() {
    }
}