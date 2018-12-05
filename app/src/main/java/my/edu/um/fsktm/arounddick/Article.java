package my.edu.um.fsktm.arounddick;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Article {

    public String title;
    public String description;
    public String tag;
    public double lat;
    public double lng;
    public String articleId;
    public String author;
    public double averageRating;
    public String cover;

    public Article(String title, String desc, String tag, double lat, double lng, String articleId) {
        this.lat = lat;
        this.lng = lng;
        this.articleId = articleId;
        this.author = "Google";
        this.cover = "";
        this.title = title;
        this.description = desc;
        this.averageRating = 0;
        this.tag = tag;
    }

    public static ArrayList<Article> getArticles(){
        ArrayList<Article> articles = new ArrayList<Article>();
        articles.add(new Article("KLCC", "twin towers", "landmark", 3.1466, 101.6958, "klcc123"));
        articles.add(new Article("Sina's house", "jom", "food", 3.1239, 101.6343, "sina123"));
        articles.add(new Article("ipoh", "kamwoh house", "food", 3.1239, 101.6343, "sina123"));
        return articles;
    }
}
