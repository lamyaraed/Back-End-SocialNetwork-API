package com.company;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import sun.rmi.runtime.Log;
import sun.security.util.Password;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int x;
    public static String Username;
    public static String Firstname;
    public static String LastName;
    public static String Email;
    public static String password;
    public static int age;
    public static String country;
    public static String gender;
    public static String Account_type;
    public static boolean in = false;
    public static Account newAccount = new Account();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        do {
            System.out.println("Welcome to our Social Network API");
            System.out.println("What do you want to do");
            System.out.println("\t 1- Create a new Account");
            System.out.println("\t 2- Log in to your account");
            System.out.println("\t 3- Exit");
            x = input.nextInt();
            input = new Scanner(System.in);
            switch (x){
                case 1:
                    //newAccount = new Account();
                    System.out.println("please Enter Your Data as Follow :");
                    System.out.println("Username, Firstname, LastName, Email, password, age, gender, country, Account_type");
                    System.out.println("NOTE : your account type should be either Premium or Regular");
                    Username = input.nextLine();
                    Firstname = input.nextLine();
                    LastName = input.nextLine();
                    Email = input.nextLine();
                    password = input.nextLine();
                    age = input.nextInt();
                    input = new Scanner(System.in);
                    gender = input.nextLine();
                    country = input.nextLine();
                    Account_type = input.nextLine();
                    if (Account_type.equals("Premium")){
                        System.out.println("choose the payment method");
                        System.out.println("enter 1 if you want to pay with credit card, 2 if you want to pay with you pay pal, 3 to exit");
                        int n = input.nextInt();
                        if (n == 1) {
                            PremiumUser.PaymentMethod useMethod = PremiumUser.PaymentMethod.CreditCard;
                            System.out.println("your account has been upgraded for one year by paying 99$");
                        } else if (n == 2) {
                            PremiumUser.PaymentMethod useMethod = PremiumUser.PaymentMethod.PayPal;
                            System.out.println("your account has been upgraded for one year by paying 99$");
                        }else if(n ==3) {
                            Account_type = "Regular";
                            System.out.println("your account type is Regular");
                        }
                    }
                    boolean Signup = newAccount.SignUp(Username, Firstname, LastName, Email, password, age, gender, country, Account_type);
                    if (Signup == true) {
                        in = true;
                        inSystem();
                    }
                    break;
                case 2:
                    System.out.println("please Enter Your Data as Follow :");
                    System.out.println("UserName, Password");
                    input = new Scanner(System.in);
                    Username = input.nextLine();
                    password = input.nextLine();
                    String Login = "";
                    Login = newAccount.LogIn(Username, password);
                    if(Login.equals("Done!!")){
                        in = true;
                        inSystem();
                    }
                    break;
                default:
                    in = false;
                    return;
            }
        }while(x != 3);

    }

    public static void inSystem(){
        while (in){
            System.out.println("What do you want to do");
            System.out.println("\t 1- Manage Account");
            System.out.println("\t 2- Add Friend");
            System.out.println("\t 3- Accept Friend Request");
            System.out.println("\t 4- Send Messages");
            System.out.println("\t 5- Create post");
            System.out.println("\t 6- Create group");
            System.out.println("\t 7- Create page");
            System.out.println("\t 8- Log out");
            x = input.nextInt();
            input = new Scanner(System.in);
            switch (x) {
                case 1:
                    newAccount = newAccount.ManageAccount();
                    in = true;
                    break;
                case 2:
                    System.out.println("write the username for the user you want to add");
                    Username = input.nextLine();
                    User Friend = null;
                    for(User o : UserDB.SystemUsers) {
                        if (o.UserName.equals(Username))
                            Friend = o;
                    }
                    if(Friend != null)
                        newAccount.User.AddFriends(Friend);
                    else
                        System.out.println("This User is not in the System");
                    in = true;
                    break;
                case 3:
                    System.out.println("These Users Sent you a friend Request");
                    for(User o :newAccount.User.FriendRequests) {
                        System.out.println(o.UserName);
                    }
                    System.out.println("write the username for the user you want to accept");
                    Username = input.nextLine();
                    boolean added = newAccount.User.acceptRequests(Username);
                    in = true;
                    break;
                case 4: in = true;break;
                case 5: in = true;break;
                case 6: in = true;break;
                case 7: in = true;break;
                case 8:
                    System.out.println("Youre Logged out");
                    in = false;
                    break;
                default:
                    in = false;
                    return;
            }
        }
    }
}
