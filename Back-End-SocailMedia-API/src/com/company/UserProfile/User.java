package com.company.UserProfile;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.io.File;
import java.util.ArrayList;


public class User {

    public String FirstName;
    public String LastName;
    public String UserName;
    public String Email;
    public String Password;
    public String Gender;
    public int Age;
    public File ProfilePicture;
    public ArrayList<User> Friends;
    public ArrayList<User> FriendRequests;

    public User(String FirstName, String LastName, String UserName, String Email, String Password, String Gender, int Age) {
    }
    public void AddFriends(User user) {
        if(FriendRequests.contains(user))
            Friends.add(user);
    }
    public Post SharePost(Post post) {
        return null;
    }
    public void MakeComment(Post post,  String comment) {
    }
    public void MakeLike(Post post) {
    }

}
