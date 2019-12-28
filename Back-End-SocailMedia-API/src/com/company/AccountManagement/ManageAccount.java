package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.io.File;
import java.util.Scanner;


public class ManageAccount {
    Account myAccount;
    Scanner input = new Scanner(System.in);

    public ManageAccount(Account myAccount){
        this.myAccount = myAccount;
        ChooseFieldToUpdate();
    }

    public void ChooseFieldToUpdate() {
        System.out.println("What Do You Want to Manage in Your Account");
        System.out.println("\t 1- Update Profile Picture");
        System.out.println("\t 2- Change your Username");
        System.out.println("\t 3- Change your password");
        System.out.println("\t 4- Change your E-mail");
        System.out.println("\t 5- Edit your First and Last names");
        System.out.println("\t 6- Edit your Gender");
        System.out.println("\t 7- Update your age");
        System.out.println("\t 8- Upgrade to premium");
        System.out.println("\t 9- Deactivate your account");
        System.out.println("\t 10- Delete your account");
        System.out.println("\t 11- Exit");
        int choice = input.nextInt();
        switch (choice){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8:
                Upgrade();
                break;
            case 9: break;
            case 10: break;
            case 11:
                return;
        }
    }
    public void Upgrade() {
        if (!this.myAccount.User.Account_Type.equals("Premium")) {
            System.out.println("choose the payment method");
            System.out.println("enter 1 if you want to pay with credit card, 2 if you want to pay with you pay pal, 3 to exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n == 1) {
                PremiumUser.PaymentMethod useMethod = PremiumUser.PaymentMethod.CreditCard;
                System.out.println("your account has been upgraded for one year by paying 99$");
                this.myAccount.User.Account_Type = com.company.UserProfile.User.AccountType.Premium;
                PremiumUser newPremium  = new PremiumUser(myAccount.User);
            } else if (n == 2) {
                PremiumUser.PaymentMethod useMethod = PremiumUser.PaymentMethod.PayPal;
                System.out.println("your account has been upgraded for one year by paying 99$");
                this.myAccount.User.Account_Type = com.company.UserProfile.User.AccountType.Premium;
                PremiumUser newPremium  = new PremiumUser(myAccount.User);
            }else if(n ==3)
                return;
        }
    }

    public void UpdateProfilePictue(File Picture) {
    }
    public void UserName(String Name) {
    }
    public void ChangePassword(String psd) {
    }
    public void ChangeEmail(String email) {
    }
    public void EditName(String FirstName,String  LastName) {
    }
    public void EditGender(String Gender) {
    }
    public void UpdateAge(int age) {
    }
    public boolean CheckPasswordValidation(String password) {
        return false;
    }
    public void DeactivateAccount() {
    }
    public void DeleteAccount() {
    }

    public boolean UserNameValidation(String UserName) {
        return false;
    }
    public void UpdateUserDB(String UserName, String Email,  String Password) {
    }

}