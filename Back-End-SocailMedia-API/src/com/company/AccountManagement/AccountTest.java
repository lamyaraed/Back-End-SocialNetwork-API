package com.company.AccountManagement;

import com.company.UserProfile.UserDB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void logIn() {
        String username = "Mariam";
        String Password = "mariam123";
        Account test = new Account();
        String s=  test.LogIn(username,Password);
        UserDB ob = new UserDB();
        assertEquals("Done!!",s);

    }

    @Test
    void checkUserName() {
    }

    @Test
    void manageAccount() {
    }

    @Test
    void upgradeRegisterationPremiumReq() {
    }

    @Test
    void setUserData() {
    }
}