package com.company.Post;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.io.File;
import java.util.ArrayList;


public class Post {

    public ArrayList<User> Likes;
    public ArrayList<String> Comments;
    public ArrayList<User> Shares;
    public String Text;
    public ArrayList<File> Photo;
    public ArrayList<File> Video;

    public Post CreatePost() {
        return null;
    }
    public int GetNumOfLikes() {
        return 0;
    }
    public int NumberOfShares() {
        return 0;
    }
    public void PostText(String Text) {
    }
    public void PostPicture(File picture) {
    }
    public void PostVideo(File video) {
    }
    public int NumberOfComments() {
        return 0;
    }
    public String PostDestination(String Dest) {
        return null;
    }
    public void addPostToDestination(Post post, String Dest) {
    }

}
