package com.company.UserProfile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcceptFriendReqTest {

    @Test
    void acceptRequests() {
        User myUser = new User("Lamya", "Raed", "LamyaRaed", "lamya@gmail.com",
                "12345678",20, "Egypt", "Female", "Regular");
        User Friend = new User("Mariam", "Makram", "mariammakram2", "mariammakram@gmail.com",
                "mariam123",16, "Egypt", "Female", "Regular");
        myUser.AddFriends(Friend);
        boolean FriendCond = Friend.acceptRequests("Lamya");
        assertEquals(true, FriendCond);
    }
}