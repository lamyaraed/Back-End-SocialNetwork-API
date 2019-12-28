package com.company.UserProfile;

import com.company.PageManagemet.FanPage;
import com.company.Post.Post;

import java.util.Scanner;

public class PremiumUser extends User {

    public Integer PaymentAmount = 99;

    public enum PaymentMethod {CreditCard, PayPal}


    public static void CreateAd() {
    }

    public static FanPage PromotePage() {
        return null;
    }

    public static void PromoteSomething() {
    }

    public void Upgrade() {
        System.out.println("choose the payment method");
        System.out.println("enter 1 if you want to pay with creditcard, 2 if you want to pay with you paypal ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1) {
            PaymentMethod useMethod = PaymentMethod.CreditCard;
        } else if (n == 2) {
            PaymentMethod useMethod = PaymentMethod.PayPal;
        }
        System.out.println("your account have been upgraded for one year by paying 99$");
        //permiumusers.add()
        System.out.println("if you want to create ad enter 1 , for promoting a page enter 2 , for promoting something enter 3 ");
        n = input.nextInt();
        if (n == 1) {
            CreateAd();
        } else if (n == 2) {
            PromotePage();
        } else if (n == 3) {
            PromoteSomething();
        }

    }

    public static void Payment() {
    }

    public Post addPost(){
        return null;
    }

}
