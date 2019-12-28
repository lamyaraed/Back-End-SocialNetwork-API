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
    Scanner input = new Scanner(System.in);

    public Account() {
        //empty constructor
    }

    public void Upgrade(User user) {
        if (!user.Account_Type.equals("Premium")) {
            System.out.println("choose the payment method");
            System.out.println("enter 1 if you want to pay with creditcard, 2 if you want to pay with you paypal ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n == 1) {
                PremiumUser.PaymentMethod useMethod = PremiumUser.PaymentMethod.CreditCard;
            } else if (n == 2) {
                PremiumUser.PaymentMethod useMethod = PremiumUser.PaymentMethod.PayPal;
            }
            System.out.println("your account have been upgraded for one year by paying 99$");
            //permiumusers.add()
            user.Account_Type = com.company.UserProfile.User.AccountType.Premium;
            System.out.println("if you want to create ad enter 1 , for promoting a page enter 2 , for promoting something enter 3 ");
            n = input.nextInt();
            if (n == 1) {
                PremiumUser.CreateAd();
            } else if (n == 2) {
                PremiumUser.PromotePage();
            } else if (n == 3) {
                PremiumUser.PromoteSomething();
            }
        }

    }

    public String LogIn(String UserName, String Password) {
        //1-check existance of this username if yes ... check if password right
        for (int i = 0; i < 3; i++) {
            if (CheckUserName(UserName)) {
                if (Password.equals(pswd)) {
                    System.out.println("Logged Successfully");
                    return "Done!!";
                    //   break;
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
                return true;
            }
        }
        return false;
    }


    public Account ManageAccount() {
        return null;
    }

    public void UpgradeRegisterationPremiumReq() {

    }

}
