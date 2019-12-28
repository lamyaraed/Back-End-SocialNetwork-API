package com.company.UserProfile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddingFriendTesting {

    @Test
    public void addFriends() {

        User myUser = new User("Lamya", "Raed", "LamyaRaed", "lamya@gmail.com",
                "12345678", 20, "Egypt", "Female", "Regular");
        User Friend = new User("Mariam", "Makram", "mariammakram2", "mariammakram@gmail.com",
                "mariam123", 16, "Egypt", "Female", "Regular");
        boolean FriendCond = myUser.AddFriends(Friend);
        assertEquals(true, FriendCond);

    }
}