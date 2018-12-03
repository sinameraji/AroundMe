package my.edu.um.fsktm.arounddick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CommentsListAdapter extends ArrayAdapter<Comment> {
    public CommentsListAdapter(Context context, ArrayList<Comment> users) {
        super(context, 0, users);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.review, parent, false);
        }

        // Get the data item for this position
        Comment review = getItem(position);

        // Lookup view for data population
        TextView userID = (TextView) convertView.findViewById(R.id.name);
        TextView comment = (TextView) convertView.findViewById(R.id.comment);
        // Populate the data into the template view using the data object
        userID.setText(review.getUserID());
        comment.setText(review.getComment());
        // Return the completed view to render on screen
        return convertView;
    }
}
