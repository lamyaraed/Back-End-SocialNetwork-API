package com.company;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;


public class Main {

    public static void main(String[] args) {

        User ob = new User("Fatma" , "Ashraf" , "FatmaAshraf" , "Fatma.ashrafgmail.com" ,
                "fatma264541" , "Female", 16);

        UserDB test = new UserDB(ob);

        User ob2 = new User("Mariam" , "Makram" , "mariammakram" , "mariammakram@gmail.com" ,
                "mariam123" , "Female", 16);

        UserDB.SystemUsers.add(ob2);

        ob.AddFriends(ob2);

        ob2.acceptRequests("FatmaAshraf");

    }
}
