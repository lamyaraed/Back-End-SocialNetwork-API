package com.company.UserProfile;

import com.company.Post.Post;

public class RegularUser extends User {
    public User me;
    public RegularUser(User user){
        this.me = user;
    }
    public Post addPost(){
        return null;
    }

}
