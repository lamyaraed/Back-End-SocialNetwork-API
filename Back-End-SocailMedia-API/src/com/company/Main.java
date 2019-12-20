package com.company;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String UserName;
        String Firstname;
        String LastName;
        String UserEmail;
        String UserPassword;
        int age;
        String country;
        String gender;
        String Account_Type;

        Scanner c = new Scanner(System.in);

        System.out.println("Hello, Enter Your Data :");
        System.out.println("username");
        UserName = c.nextLine();
        System.out.println("FirstName");
        Firstname = c.nextLine();
        System.out.println("Lastname");
        LastName = c.nextLine();
        System.out.println("email");
        UserEmail = c.nextLine();
        System.out.println("pswd");
        UserPassword = c.nextLine();
        System.out.println("age");
        age = c.nextInt();
        System.out.println("country");
        country = c.nextLine();
        System.out.println("gender");
        gender = c.nextLine();
        System.out.println("acc type");
        Account_Type = c.nextLine();

        SignUp newAcc  = new SignUp();
        newAcc.getPersonalInfo(UserName,Firstname,LastName,UserEmail,UserPassword,age,country,gender,Account_Type);
    }
}
