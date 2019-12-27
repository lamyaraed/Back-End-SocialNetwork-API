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
    Scanner input = new Scanner(System.in);

    public Account() {
        //empty constructor
    }

    public void LogIn(String UserName, String Password) {
        //1-check existance of this username if yes ... check if password right
        for (int i = 0; i < 3; i++) {
            if (CheckUserName(UserName)) {
                if (Password.equals(pswd)) {
                    System.out.println("Logged Successfully");
                    break;
                } else {
                    System.out.println("InValid Password !");
                    System.out.println("Re-Enter Password : ");
                    Password = input.next();
                }
            } else {
                System.out.println("InValid UserName !");
                System.out.println("Re-Enter Your Data : ");
                UserName = input.next();
                System.out.println("Enter Your Password : ");
                Password = input.next();
            }
            if (i >= 2) {
                System.out.println("InValid Data Try Again Later...");
                break;
            }
        }

    }

    //Search For this username in user database.
    public boolean CheckUserName(String UserName) {
        for (User o : UserDB.SystemUsers) {
            if (!(o.UserName.equals(UserName))) {
                continue;
            } else {
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
        prem.Upgrade();
        permiumusers.add(Username);
    }

    public void setUserData(String UserName, String Firstname, String LastName, String UserEmail, String UserPassword, int age, String country, String gender, String Account_Type) {
        //User = new User(UserName,Firstname,LastName,UserEmail,UserPassword,age,country,gender,Account_Type);
//    	if(Account_Type.equals("Premium"))
//    		PremiumAccount.Upgrade();
    }
}
