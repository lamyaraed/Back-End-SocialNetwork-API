package com.company.AccountManagement;

import com.company.UserProfile.User;
import com.company.UserProfile.UserDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogInTest {

    @Test
    void logIn() {
        User myUser = new User("Mariam", "Makram", "mariammakram2", "mariammakram@gmail.com",
                "mariam123",16, "Egypt", "Female", "Regular");

        String username = "Mariam";
        String Password = "mariam123";
        Account test = new Account();

        String s=  test.LogIn(username,Password);
        UserDB ob = new UserDB();
        assertEquals("Done!!",s);
    }
}