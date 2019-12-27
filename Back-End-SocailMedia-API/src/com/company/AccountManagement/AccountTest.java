package com.company.AccountManagement;

import com.company.UserProfile.User;
import com.company.UserProfile.UserDB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void logIn() {
        String username = "Fatma";
        String Password = "fatma264541";
        Account test = new Account();
   //     User ob = new User("Fatma", "Ashraf", "FatmaAshraf", "Fatma.ashrafgmail.com", "fatma264541",16, "Egypt", "Female", "Regular");

        String s=  test.LogIn(username,Password);
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