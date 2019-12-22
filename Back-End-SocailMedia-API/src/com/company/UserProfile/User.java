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


//todo accepted : boolean                   (In user class)
//todo acceptRequests : void                (in User class)
//todo FriendRequests : Array<User>         (in User class)
//todo Posts : Array<Post>                  (in user class)
//todo viewPosts(String username) : void    (in user class)
//todo isFriend : boolean                   (In user class)


public class User {

    public String FirstName;
    public String LastName;
    public String UserName;
    public String Email;
    public String Password;
    public String Gender;
    public int Age;
    public File ProfilePicture;
    public ArrayList<User> Friends = new ArrayList<>();
    public ArrayList<User> FriendRequests = new ArrayList<>();
    public ArrayList<Post> Posts = new ArrayList<>();
    public boolean accepted = false;
    public boolean isFriend = false;

    public User(String FirstName, String LastName, String UserName, String Email, String Password, String Gender, int Age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
        this.Gender = Gender;
        this.Age = Age;
    }

    /* If Logged in user wants to Send friend request*/
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
            System.out.println("Friend request accepted successfully, you're now friends.");
        else
            System.out.println("Friend request doesn't exist.");
    }

    public Post SharePost(Post post) {
        return null;
    }

    public void MakeComment(Post post, String comment) {
    }

    public void MakeLike(Post post) {
    }

    public void viewPosts(String username) {
        if (username.equals(this.UserName)) {
            for (Post post : Posts) {
                System.out.println("Post Text: " + post.Text + "\nPost Likers: ");
                for (int i = 0; i < post.Likes.size(); i++)
                    System.out.println(post.Likes.get(i) + "\n");

                System.out.println("\nComments on post: ");

                for (int i = 0; i < post.Comments.size(); i++)
                    System.out.println(post.Comments.get(i) + "\n");

                System.out.println("\nNumber of Shares: " + post.Shares.size() + "\nNumber of likes: " + post.Likes.size()
                                + "\nNumber of comments: " + post.Comments.size());
            }
        } else {
            for (User user : UserDB.SystemUsers) {
                if (user.UserName.equals(username) && this.Friends.contains(user)) {
                    for (Post post : user.Posts) {
                        System.out.println("Post Text: " + post.Text + "\nPost Likers: ");

                        for (int i = 0; i < post.Likes.size(); i++)
                            System.out.println(post.Likes.get(i) + "\n");

                        System.out.println("\nComments on post: ");

                        for (int i = 0; i < post.Comments.size(); i++)
                            System.out.println(post.Comments.get(i) + "\n");

                        System.out.println("\nNumber of Shares: " + post.Shares.size() + "\nNumber of likes: " + post.Likes.size()
                                        + "\nNumber of comments: " + post.Comments.size());
                    }
                    isFriend = true;
                    break;
                }
            }
            if(!isFriend)
                System.out.println("\nYou're not able to view this user's profile.");
        }
    }

}
