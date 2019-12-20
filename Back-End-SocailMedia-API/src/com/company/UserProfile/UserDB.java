package com.company.UserProfile;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.ArrayList;

// todo UserDB --> UpdateUserProfilePicture(Image) , UpdateUserName(UserName) ,  UpdateAge(Integer) , [Valid]UpdatePassword(Password)

public class UserDB {

    public static ArrayList<User> SystemUsers = new ArrayList<>();
    public UserDB(User user) {
        SystemUsers.add(user);
    }

}
