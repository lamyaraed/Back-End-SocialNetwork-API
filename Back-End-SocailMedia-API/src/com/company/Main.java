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

        User ob = new User("FatmaAshraf" , "Fatma" , "Ashraf" , "Fatma.ashrafgmail.com" ,
                "fatma264541" , 16 , "Egypt" , "Female","Regular");


        UserDB test = new UserDB(ob);

        Scanner c = new Scanner(System.in);

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
//        System.out.println("acc type {Regular,Premium}");
//        Account_Type = c.next();
//
//
//
        SignUp newAcc  = new SignUp();
        newAcc.getPersonalInfo("lamyaraed","lamya","raed","lamyaraed24gmail","123456789",20,"Egypt",
                "female","Premium");
//
<<<<<<< Updated upstream
=======
        User ob2 = new User("Mariam", "Makram", "mariammakram", "mariammakram@gmail.com",
                "mariam123", 16, "Egypt", "Female", "Regular");

        User ob3 = new User("Mariam", "Makram", "mariammakram2", "mariammakram@gmail.com",
                "mariam123",16, "Egypt", "Female", "Regular");

        UserDB.SystemUsers.add(ob2);
        UserDB.SystemUsers.add(ob3);

        Search sc = new Search();
        ArrayList<User> foundUsers = new ArrayList<>();
        foundUsers = sc.FindUser("Mariam Makram");
        if (!foundUsers.isEmpty()) {
            if (foundUsers.size() == 1)
                ob.AddFriends(foundUsers.get(0));
            else {
                byte i = 1, choice;
                for (User foundUser : foundUsers) {
                    System.out.println(i + ") " + foundUser.FirstName + " " + foundUser.LastName + "   Username: " + foundUser.UserName);
                    i++;
                }
                System.out.println("Choose the user you want");
                choice = (byte) scan.nextInt();
                ob.AddFriends(foundUsers.get(choice-1));
                System.out.println(choice);

            }
        }
>>>>>>> Stashed changes

        /*System.out.println("LogIN : ");
        System.out.println("Hello, Enter Your Data :");
        System.out.println("username");
        UserName = c.next();
        System.out.println("pswd");
        UserPassword = c.next();
        Account tst = new Account();
        tst.LogIn(UserName , UserPassword);*/

    }
}
