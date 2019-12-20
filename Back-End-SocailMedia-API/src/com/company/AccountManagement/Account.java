package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

public class Account {
    public User User;

    public Account(){
        //empty constructor
    }
    public User LogIn( String UserName, String Password) {
        return null;
    }
    public Account ManageAccount() {
        return null;
    }
    public void UpgradeRegisterationPremiumReq() {
        PremiumAccount prem;
    }

    public void setUserData(String UserName, String Firstname, String LastName, String UserEmail, String UserPassword, int age, String country, String gender, String Account_Type) {
        User = new User(UserName,Firstname,LastName,UserEmail,UserPassword,age,country,gender,Account_Type);
    }
}
