package my.edu.um.fsktm.arounddick;

import java.util.ArrayList;

public class Review {
    public String userID;
    public String comment;
    public String articleID;
    public String userAvatar;

    public Review(String userID, String comment){
        this.userID = userID;
        this.comment = comment;
        articleID = "xyz";
        userAvatar = "";
    }
    public static ArrayList<Review> getReviews(){
        ArrayList<Review> reviews = new ArrayList<Review>();
        reviews.add(new Review("sina", "nice place"));
        reviews.add(new Review("kamwoh", "okay place"));
        reviews.add(new Review("chiayi", "shit place"));
        return reviews;
    }
}
