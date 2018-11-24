package com.arby.recyclingnews;

/**
 * Created by rares on 23.08.2017.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> adapter) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, adapter);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link News} object located at this position in the list
        final News currentNews = getItem(position);

        String title = currentNews.getTitle();
        String author = currentNews.getAuthorsName();
        String date = currentNews.getDate();
        String section = currentNews.getSection();

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(title);

        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(author);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(section);

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(date);

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
