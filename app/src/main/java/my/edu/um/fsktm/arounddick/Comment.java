package my.edu.um.fsktm.arounddick;

import android.media.Image;

import java.util.ArrayList;

public class Comment {
    public String userID;
    public String comment;
    public String articleID;
    public float rating;
    public String avatar;

    public Comment(String userID, String comment,float rating, String avatar){
        this.userID = userID;
        this.comment = comment;
        this.rating = rating;
        this.avatar = avatar;
        articleID = "xyz";
    }

    public String getUserID(){
        return userID;
    }

    //retrieve users' hometown
    public String getComment(){
        return comment;
    }

    public float getRating(){
        return rating;
    }

    public static ArrayList<Comment> getReviews(){
        ArrayList<Comment> comments = new ArrayList<Comment>();
        comments.add(new Comment("sina", "nice place", 5, ""));
        comments.add(new Comment("kamwoh", "okay place",4, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        comments.add(new Comment("chiayi", "shit place",1, ""));
        return comments;
    }
}
