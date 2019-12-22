package com.company;

import com.company.UserProfile.*;
import com.company.AccountManagement.*;
import com.company.GroupManagement.*;
import com.company.Inbox.*;
import com.company.PageManagemet.*;
import com.company.Post.*;
import com.company.Search.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        User ob = new User("Fatma", "Ashraf", "FatmaAshraf", "Fatma.ashrafgmail.com",
                "fatma264541", "Female", 16);

        UserDB test = new UserDB(ob);

        User ob2 = new User("Mariam", "Makram", "mariammakram", "mariammakram@gmail.com",
                "mariam123", "Female", 16);
        User ob3 = new User("Mariam", "Makram", "mariammakram2", "mariammakram@gmail.com",
                "mariam123", "Female", 16);

        UserDB.SystemUsers.add(ob2);
        UserDB.SystemUsers.add(ob3);

        Search sc = new Search();
        ArrayList<User> foundUsers = sc.FindUser("Mariam Makram");
        if (!foundUsers.isEmpty()) {
            if (foundUsers.size() == 1)
                ob.AddFriends(foundUsers.get(0));
            else {
                byte i = 1, choice;
                for (User foundUser : foundUsers) {
                    System.out.println(i + ") " + foundUser.FirstName + " " + foundUser.LastName + "   Username: " + foundUser.UserName);
                    i++;
                }
                System.out.println("Choose the user you want");
                choice = (byte) scan.nextInt();
                ob.AddFriends(foundUsers.get(choice-1));
            }
        }

        ob2.acceptRequests("FatmaAshraf");

    }
}
