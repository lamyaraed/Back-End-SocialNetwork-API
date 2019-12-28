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
    public String Country;
    public AccountType Account_Type;
    public enum AccountType {Regular, Premium};

    public File ProfilePicture;
    public ArrayList<User> Friends = new ArrayList<>();
    public ArrayList<User> FriendRequests = new ArrayList<>();

    public boolean accepted = false;

    public User() {
    }

    public User(User ob) {
        this.UserName = ob.UserName;
        this.FirstName = ob.FirstName;
        this.LastName = ob.LastName;
        this.Email = ob.Email;
        this.Password = ob.Password;
        this.Age = ob.Age;
        this.Country = ob.Country;
        this.Gender = ob.Gender;
        UserDB.SystemUsers.add(this);
    }

    public User(String UserName, String Firstname, String LastName, String UserEmail, String UserPassword, int age, String country, String gender, String Account_Type) {
        this.UserName = UserName;
        FirstName = Firstname;
        this.LastName = LastName;
        Email = UserEmail;
        Password = UserPassword;
        Age = age;
        Country = country;
        Gender = gender;
        this.Account_Type = AccountType.valueOf(Account_Type);
        UserDB.SystemUsers.add(this);
    }


    /* If Logged in user wants to accept friend request*/
    public boolean AddFriends(User user) {
        if (!user.FriendRequests.contains(this)) {
            user.FriendRequests.add(this);
            System.out.println("Your request has been sent successfully");
            return true;
        } else {
            System.out.println("Request is sent before");
            return false;
        }
    }

    /* If Logged in user wants to accept friend request*/
    public boolean acceptRequests(String username) {
        if (!FriendRequests.isEmpty()) {
            for (User user : UserDB.SystemUsers) {
                if (user.UserName.equals(username) && FriendRequests.contains(user)) {
                    Friends.add(user);
                    user.Friends.add(this);
                    FriendRequests.remove(user);
                    accepted = true;
                    break;
                }
            }
        }
        if (accepted) {
            System.out.println("Friend request accepted successfully.");
            return true;
        }
        else {
            System.out.println("Friend request doesn't exist");
            return false;
        }
    }

    public Post SharePost(Post post) {
        return null;
    }

    public void MakeComment(Post post, String comment) {
    }

    public void MakeLike(Post post) {
    }

}


