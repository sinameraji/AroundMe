package my.edu.um.fsktm.arounddick;

import java.util.ArrayList;

public class Comment {
    public String userID;
    public String comment;
    public String articleID;

    public Comment(String userID, String comment){
        this.userID = userID;
        this.comment = comment;
        articleID = "xyz";
    }

    public String getUserID(){
        return userID;
    }

    //retrieve users' hometown
    public String getComment(){
        return comment;
    }

    public static ArrayList<Comment> getReviews(){
        ArrayList<Comment> comments = new ArrayList<Comment>();
        comments.add(new Comment("sina", "nice place"));
        comments.add(new Comment("kamwoh", "okay place"));
        comments.add(new Comment("chiayi", "shit place"));
        return comments;
    }
}
