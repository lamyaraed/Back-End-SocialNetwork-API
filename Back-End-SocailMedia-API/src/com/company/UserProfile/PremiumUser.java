package com.company.UserProfile;

import com.company.PageManagemet.FanPage;
import com.company.Post.Post;

import java.util.Scanner;

public class PremiumUser extends User {

    public Integer PaymentAmount = 99;
    public enum PaymentMethod {CreditCard, PayPal}
    Scanner input = new Scanner(System.in);
    public User me;
    public PremiumUser(User user){
        this.me = user;
    }
    public void premiumAccountFunc(){
        System.out.println("if you want to create ad enter 1 , for promoting a page enter 2 , for promoting something enter 3, 4 to exit ");
        int n = input.nextInt();
        if (n == 1) {
            CreateAd();
        } else if (n == 2) {
            PromotePage();
        } else if (n == 3) {
            PromoteSomething();
        }else if(n==4)
            return;
    }
    public static void CreateAd() {
    }
    public static FanPage PromotePage() {
        return null;
    }
    public static void PromoteSomething() {
    }
    public static void Payment() {
    }
    public Post addPost(){
        return null;
    }

}
