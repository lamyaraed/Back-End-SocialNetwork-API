package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.sun.org.apache.bcel.internal.classfile.Constant;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;


public class PremiumAccount {

    Constant public Integer PaymentAmount =99 ;
    public enum PaymentMethod{CreditCard, PayPal};

    public void CreateAd() {
    }
    public FanPage PromotePage() {
        return null;
    }
    public void PromoteSomething() {
    }
    public static  void Upgrade() {
    	System.out.println("choose the payment method");
    	System.out.println("enter 1 if you want to pay with creditcard, 2 if you want to pay with you paypal ");
    	int n=input.nextInt()
    	if(n==1) {
    		PaymentMethod useMethod = PaymentMethod.CreditCard;
    	}
    	else if(n==2) {
    		PaymentMethod useMethod = PaymentMethod.PayPal;
    	}
    	System.out.println("your account have been upgraded for one year by paing 99$");
    	//permiumusers.add()
    	System.out.println("if you want to create ad enter 1 , for promoting a page enter 2 , for promoting something enter 3 ")
    	int n=input.nextInt()
    	if (n==1) {
    		CreateAd();
    	}
    	else if (n==2) {
    		PromotePage();
    	}
    	else if (n==3) {
    		PromoteSomething
    	}
    	
    }
    public void Payment() {
    }

}
