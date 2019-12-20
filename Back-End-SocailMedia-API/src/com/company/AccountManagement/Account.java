package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.Scanner;

public class Account {
    public User User;
    public String Username;
    public String pswd;
    Scanner input  = new Scanner(System.in);

    public Account(){
        //empty constructor
    }

    public void LogIn( String UserName, String Password) {
        //1-check existance of this username if yes ... check if password right
        if(CheckUserName(UserName))
        {
            if(Password.equals(pswd))
            {
                System.out.println("Logged Successfully");
            }
            else
            {
                System.out.println("InValid Password !");
                for (int i = 0; i < 3; i++) {
                    System.out.println("R2-Enter Your Password : ");
                    Password = input.next();
                    if(Password.equals(pswd))
                    {
                        System.out.println("Logged Successfully");
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
    }

    //Search For this username in user database.
    public boolean CheckUserName(String UserName){
        for (User o : UserDB.SystemUsers) {
            if (! (o.UserName.equals(UserName))) {
                continue;
            }
            else
            {
                Username = UserName;
                pswd = o.Password;
                return true;
            }
        }
        return false;
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
