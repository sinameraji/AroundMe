package my.edu.um.fsktm.arounddick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Comments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        populateCommentsList();
    }

    private void populateCommentsList() {
        // Construct the data source
        ArrayList<Comment> arrayOfUsers = Comment.getReviews();
        // Create the adapter to convert the array to views
        CommentsListAdapter adapter= new CommentsListAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvReviews);
        listView.setAdapter(adapter);
    }
}
