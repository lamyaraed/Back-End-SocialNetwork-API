package com.company.PageManagemet;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.ArrayList;


public class FanPage {
    public String Name;
    public int FansNum;
    public ArrayList<User> Fans;
    public ArrayList<User> Admins;
    public String PageDiscription;

    public void CreatePage(String Name, User Admin) {
    }
    public int GetNumbofFans() {
        return 0;
    }
    public void Invite(User user) {
    }
    public void ManageFanPageReq() {
    }
    public boolean checkUsersValidation(String username){return false;}
    public boolean checkPageNameValidation(String pageName){return false;}
}
