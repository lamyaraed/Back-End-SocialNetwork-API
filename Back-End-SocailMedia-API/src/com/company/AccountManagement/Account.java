package com.company.AccountManagement;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

public class Account {
    public String UserName;
    public String Password;
    public User User;

    public enum Account_Type{Regular, Premium};
    public User LogIn( String UserName, String Password) {
        return null;
    }
    public Account ManageAccount() {
        return null;
    }
    public void UpgradeRegisterationPremiumReq() {
        PremiumAccount prem;
    }

}
