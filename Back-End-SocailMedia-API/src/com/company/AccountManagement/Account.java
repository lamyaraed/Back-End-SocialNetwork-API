package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.ArrayList;

import java.util.Scanner;

public class Account {
    public User User;
    public static String Username;
    public static String pswd;
    public String UserEmail;
    public boolean flag = true;
    Scanner input = new Scanner(System.in);
    public ManageAccount myManage;

    public Account() {
        //empty constructor
    }

    public boolean SignUp(String username, String Firstname, String LastName, String email, String password, int age, String gender, String country, String Account_type){
        this.Username = username;
        this.UserEmail = email;
        this.pswd= password;
        VerifyAccount();

        if (flag){
            this.User = new User(username,Firstname,LastName,email,password,age,gender,country,Account_type);
            System.out.println("your account has been created");
            return true;
        }
        else {
            System.out.println("Invalid inputs, try again later");
            return false;
        }
    }
    //verifying user's data for signing up
    public void VerifyAccount() {
        if (!CheckEmail())
            flag = false;
        else if (!CheckUserName())
            flag = false;
        else if (!CheckPassword())
            flag = false;
        else
            flag = true;
    }
    public boolean CheckEmail() {
        boolean emailFlag = true;
        for (int i = 0; i < 3; i++) {
            for (User o : UserDB.SystemUsers)
            {
                if (o.Email.equals(UserEmail) )
                {
                    emailFlag = false;
                    System.out.println("This Email Already Exists!");
                    System.out.println("Re-Enter a new Email");
                    UserEmail = input.nextLine();
                    break;
                }
                emailFlag = true;
            }
        }
        if (emailFlag == false)
            return false;
        else
            return true;
    }
    public boolean CheckUserName() {
        boolean nameFlag = true;
        for (int j = 0; j < 3; j++) {
            for (User o : UserDB.SystemUsers) {
                if (o.UserName.equals(Username)) {
                    nameFlag = false;
                    System.out.println("The UserName You entered already exists!");
                    System.out.println("Re-Enter a new Username");
                    Username = input.nextLine();
                    break;
                }
                nameFlag = true;
            }
        }
        if(nameFlag == false)
            return false;
        else
            return true;
    }
    public boolean CheckPassword() {
        boolean pswdFlag = true;
        for (int j = 0; j < 3; j++) {
            if (Username.equals(pswd)) {
                pswdFlag = false;
                System.out.println("Your UserName should not be your Password!");
                System.out.println("Re-Enter a new password");
                pswd = input.nextLine();
                break;
            }
            else if (pswd.length() < 8) {
                pswdFlag = false;
                System.out.println("Password should contain more than 8 char");
                System.out.println("Re-Enter a new password");
                pswd = input.nextLine();
                break;
            }
            pswdFlag = true;
        }
        if(pswdFlag == false)
            return false;
        else
            return true;
    }

    public String LogIn(String UserName, String Password) {
        //1-check existance of this username if yes ... check if password right
        for (int i = 0; i < 3; i++) {
            if (CheckUserName(UserName)) {
                if (Password.equals(pswd)) {
                    System.out.println("Logged Successfully");
                    return "Done!!";
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
        return "Error";

    }

    //Search For this username in user database.
    public boolean CheckUserName(String UserName) {
        for (User o : UserDB.SystemUsers) {
            if (!(o.UserName.equals(UserName))) {
                continue;
            } else {
                Username = UserName;
                pswd = o.Password;
                User = o;
                return true;
            }
        }
        return false;
    }

    public Account ManageAccount() {
        myManage = new ManageAccount(this);
        return null;
    }

    public void UpgradeRegisterationPremiumReq() {

    }

}
