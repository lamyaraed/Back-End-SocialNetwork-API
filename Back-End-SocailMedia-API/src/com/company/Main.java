package com.company;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;
import sun.rmi.runtime.Log;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    /*
    * UpdateUserProfilePicture(Image) , UpdateUserName(UserName) ,  UpdateAge(Integer) ,UpdatePassword(Password) , UpdateGender(Gender)
    * UpdateEmail(Email)
    *
    * kolohom void
    * */

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

        Scanner scan = new Scanner(System.in);
        User ob = new User("Fatma", "Ashraf", "FatmaAshraf", "Fatma.ashrafgmail.com", "fatma264541",16, "Egypt", "Female", "Regular");


     //   UserDB test = new UserDB(ob);

        Scanner c = new Scanner(System.in);
//
//        System.out.println("Hello, Enter Your Data :");
//        System.out.println("username");
//        UserName = c.nextLine();
//        System.out.println("FirstName");
//        Firstname = c.nextLine();
//        System.out.println("Lastname");
//        LastName = c.nextLine();
//        System.out.println("email");
//        UserEmail = c.nextLine();
//        System.out.println("pswd");
//        UserPassword = c.nextLine();
//        System.out.println("age");
//        age = c.nextInt();
//        System.out.println("country");
//        country = c.next();
//        System.out.println("gender");
//        gender = c.next();
//        System.out.println("acc type");
//        Account_Type = c.next();
////
////
////
//        SignUp newAcc  = new SignUp();
//        newAcc.getPersonalInfo(UserName,Firstname,LastName,UserEmail,UserPassword,age,country,gender,Account_Type);
//
        User ob2 = new User("Mariam", "Makram", "mariammakram", "mariammakram@gmail.com",
                "mariam123", 16, "Egypt", "Female", "Regular");

        User ob3 = new User("Mariam", "Makram", "mariammakram2", "mariammakram@gmail.com",
                "mariam123",16, "Egypt", "Female", "Regular");



//        Search sc = new Search();
//        ArrayList<User> foundUsers = sc.FindUser("Mariam Makram");
//        if (!foundUsers.isEmpty()) {
//            if (foundUsers.size() == 1)
//                ob.AddFriends(foundUsers.get(0));
//            else {
//                byte i = 1, choice;
//                for (User foundUser : foundUsers) {
//                    System.out.println(i + ") " + foundUser.FirstName + " " + foundUser.LastName + "   Username: " + foundUser.UserName);
//                    i++;
//                }
//                System.out.println("Choose the user you want");
//                choice = (byte) scan.nextInt();
//                ob.AddFriends(foundUsers.get(choice-1));
//                System.out.println(choice);
//
//            }
//        }

        System.out.println("LogIN : ");
        System.out.println("Hello, Enter Your Data :");
        System.out.println("username");
        UserName = c.next();
        System.out.println("pswd");
        UserPassword = c.next();
        Account tst = new Account();
        tst.LogIn(UserName , UserPassword);
        tst.Upgrade(ob2);

        for (User user : UserDB.SystemUsers) {
            System.out.println(user.UserName + "   " + user.Account_Type);

        }

       /* User myUser= new User("Lamya", "Raed", "LamyaRaed", "lamya@gmail.com",
                "12345678",20, "Egypt", "Female", "Premium");
        */
    }
}
