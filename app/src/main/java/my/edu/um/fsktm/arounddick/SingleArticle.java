package my.edu.um.fsktm.arounddick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SingleArticle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_article);
        populateReviewsList();
    }

    private void populateReviewsList() {
        ArrayList<Review> arrayOfUsers = Review.getReviews();
        // Create the adapter to convert the array to views
//        CustomUsersAdapter adapter = new CustomUsersAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
//        ListView listView = (ListView) findViewById(R.id.lvUsers);
//        listView.setAdapter(adapter);
    }
}
