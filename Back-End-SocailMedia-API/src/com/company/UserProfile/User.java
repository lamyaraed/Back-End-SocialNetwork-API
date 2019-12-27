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

    public enum AccountType {Regular, Premium};

    public File ProfilePicture;
    public ArrayList<User> Friends = new ArrayList<>();
    public ArrayList<User> FriendRequests = new ArrayList<>();
    public ArrayList<PermiumAccount>  permiumusers = new ArrayList<>();
    public boolean accepted = false;


    //todo accepted : boolean           (In user class)
//todo acceptRequests : void        (in User class)
//todo FriendRequests : Array<User> (in User class)


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
        //AccountType = UserAccount.User.AccountType.isValidEnum(MyEnum.class, Account_type);
        if(Account_Type=="Premium") {
        	permiumusers.add(this.UserName);
        }
    }


    /* If Logged in user wants to accept friend request*/
    public void AddFriends(User user) {
        if (!user.FriendRequests.contains(this)) {
            user.FriendRequests.add(this);
            System.out.println("Your request has been sent successfully");
        } else
            System.out.println("Request is sent before");
    }

    /* If Logged in user wants to accept friend request*/
    public void acceptRequests(String username) {
        if (!FriendRequests.isEmpty()) {
            for (User user : UserDB.SystemUsers) {
                if (user.UserName.equals(username) && FriendRequests.contains(user)) {
                    Friends.add(user);
                    FriendRequests.remove(user);
                    accepted = true;
                    break;
                }
            }
        }
        if (accepted)
            System.out.println("Friend request accepted successfully.");
        else
            System.out.println("Friend request doesn't exist");
    }

    public Post SharePost(Post post) {
        return null;
    }

    public void MakeComment(Post post, String comment) {
    }

    public void MakeLike(Post post) {
    }

}

