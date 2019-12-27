package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.Scanner;


public class SignUp {
    public String UserName;
    public String UserPassword;
    public String UserEmail;
    public Account UserAccount;
    Scanner input = new Scanner(System.in);
    public boolean flag = true;

    public SignUp(){

    }

    public boolean getPersonalInfo(String username, String Firstname, String LastName, String email, String password, int age, String gender, String country, String Account_type) {
        this.UserName = username;
        this.UserEmail = email;
        this.UserPassword = password;
        VerifyAccount();

        if (flag){
            UserAccount = new Account();
            UserAccount.setUserData(username,Firstname,LastName,email,password,age,gender,country,Account_type);
            return true;
        }
        else
        {       System.out.println("Invalid inputs, try again later");
                return false;
        }
    }

    public Account Activate() {
        return null;
    }

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

    //Search For this Email in user database.
    public boolean CheckEmail()
    {
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


    //Search For this username in user database.
    public boolean CheckUserName() {
        boolean nameFlag = true;
        for (int j = 0; j < 3; j++) {
            for (User o : UserDB.SystemUsers) {
                if (o.UserName.equals(UserName)) {
                    nameFlag = false;
                    System.out.println("The UserName You entered already exists!");
                    System.out.println("Re-Enter a new Username");
                    UserName = input.nextLine();
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
            if (UserName.equals(UserPassword)) {
                pswdFlag = false;
                System.out.println("Your UserName should not be your Password!");
                System.out.println("Re-Enter a new password");
                UserPassword = input.nextLine();
                break;
            }
            else if (UserPassword.length() < 8) {
                pswdFlag = false;
                System.out.println("Password should contain more than 8 char");
                System.out.println("Re-Enter a new password");
                UserPassword = input.nextLine();
                break;
            }
            pswdFlag = true;
        }
        if(pswdFlag == false)
            return false;
        else
            return true;
    }
}
