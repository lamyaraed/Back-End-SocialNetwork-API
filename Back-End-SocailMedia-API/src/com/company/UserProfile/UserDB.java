package com.company.UserProfile;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.ArrayList;


public class UserDB {
    public static ArrayList<User> SystemUsers = new ArrayList<>();

    public UserDB(User user) {
       User ob = new User(user);
     SystemUsers.add(ob);
    }

}
