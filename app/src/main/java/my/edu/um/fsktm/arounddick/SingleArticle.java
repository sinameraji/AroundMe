package my.edu.um.fsktm.arounddick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.ScrollView;

import java.util.ArrayList;

public class SingleArticle extends AppCompatActivity {
    private  CommentsListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_article);

        populateCommentsList();

        ListView listView = (ListView) findViewById(R.id.lvReviews);
        final ScrollView scrollViewParent = (ScrollView)findViewById(R.id.rlLayout);
        View customView = (View)findViewById(R.id.customView);
        // Merge the scroll function of ListView && ScrollView
        customView.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        scrollViewParent.requestDisallowInterceptTouchEvent(true);
                        // Disable touch on transparent view
                        return false;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        scrollViewParent.requestDisallowInterceptTouchEvent(false);
                        return true;

                    case MotionEvent.ACTION_MOVE:
                        scrollViewParent.requestDisallowInterceptTouchEvent(true);
                        return false;

                    default:
                        return true;
                }
            }
        });

        final Button button = findViewById(R.id.submit);
        final EditText review = (EditText) findViewById(R.id.review);
        final RatingBar rate = (RatingBar) findViewById(R.id.ratingBar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Comment cm = new Comment("userid", review.getText().toString(), rate.getRating(), "");
                //TODO: write comment to firebase

            }
        });



    }



    private void populateCommentsList() {
        final ArrayList<Comment> arrayOfReviews= Comment.getReviews();
        // Create the adapter to convert the array to views
        adapter= new CommentsListAdapter(this, arrayOfReviews);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvReviews);
        listView.setAdapter(adapter);
        setListViewHeightBasedOnChildren(listView);
    }

    /**** Method for Setting the Height of the ListView dynamically.
     **** Hack to fix the issue of not showing all the items of the ListView
     **** when placed inside a ScrollView  ****/
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null)
            return;

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight = 0;
        View view = null;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            view = listAdapter.getView(i, view, listView);
            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.WRAP_CONTENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
}