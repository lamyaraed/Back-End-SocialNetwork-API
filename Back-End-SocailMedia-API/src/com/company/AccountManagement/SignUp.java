package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;


public class SignUp {
    public String UserName;
    public String UserPassword;
    public String UserEmail;
    public Account UserAccount;
    public boolean flag = true;

    public SignUp(){

    }

    public void getPersonalInfo(String username, String Firstname, String LastName, String email, String password, int age, String gender, String country, String Account_type) {
        this.UserName = username;
        this.UserEmail = email;
        this.UserPassword = password;
        VerifyAccount();
        if (flag){
            UserAccount = new Account();
            UserAccount.setUserData(username,Firstname,LastName,email,password,age,gender,country,Account_type);
        }
    }

    public Account Activate() {
        return null;
    }

    public void VerifyAccount() {
        if(!CheckEmail())
            flag = false;
        else if(!CheckUserName())
            flag = false;
        else if(!CheckPassword())
            flag = false;
        else
            flag = true;
    }

    //Search For this Email in user database.
    public boolean CheckEmail()
    {
        for (User o : UserDB.SystemUsers) {
            if (o.Email.equals(UserEmail)) {
                System.out.println("This Email Already Exists !");
                return false;
            }
        }
        return true;
    }


    //Search For this username in user database.
    public boolean CheckUserName(){
        for (User o : UserDB.SystemUsers) {
            if (o.UserName.equals(UserName)) {
                System.out.println("The UserName You Entered Already Exists!");
                return false;
            }
        }
        return true;
    }

    public boolean CheckPassword() {
        if(UserName == UserPassword) {
            System.out.println("Your UserName should not be your Password!");
            return false;
        }
        else if(UserPassword.length()<8) {
            System.out.println("Password should contain more than 8 char");
            return false;
        }
        return true;
    }

}
