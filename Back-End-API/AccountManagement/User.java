package AccountManagement;

import Array;
import void;
import java.util.Vector;
import Constructor;
import String;
import Post.Post;
import File;
import Int;

public class User {

  public String FirstName;

  public String LastName;

  public String UserName;

  public String E-mail;

  public String Password;

  public String Gender;

  public Int Age;

  public File ProfilePicture;

  public Array Friends;

    /**
   * 
   * @element-type Group
   */
  public Vector  CreateGroup;
    public Vector  1 .. *;
    public Vector  1 .. *;
    public Vector  1 .. *;
    public Vector  1 ..*;
    public Vector  1 .. *;
    public Vector  1 .. *;
    public Vector  1..*;
    public Vector  1..*;
    public Vector  1..*;
    public Vector  1..*;
    public Vector  Has;
    public Vector  myUsersDB;

  public Constructor User( FirstName,  LastName,  UserName,  E-mail,  Password,  Gender,  Age) {
  return null;
  }

  public void AddFriends( User) {
  }

  public Post SharePost( Post) {
  return null;
  }

  public void MakeComment( Post,  String) {
  }

  public void MakeLike( Post) {
  }

}