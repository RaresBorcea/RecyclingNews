package com.arby.recyclingnews;

import android.app.Activity;
import androidx.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> adapter) {
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

        // Get the News object located at this position in the list
        final News currentNews = getItem(position);

        String title = currentNews.getTitle();
        String author = currentNews.getAuthorsName();
        String date = currentNews.getDate();
        String section = currentNews.getSection();

        TextView titleView = listItemView.findViewById(R.id.title);
        titleView.setText(title);

        TextView authorView = listItemView.findViewById(R.id.author);
        authorView.setText(author);

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(section);

        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(date);

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
