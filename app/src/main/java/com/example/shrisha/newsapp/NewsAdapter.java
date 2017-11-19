package com.example.shrisha.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shrisha on 8/10/17.
 */

public class NewsAdapter extends ArrayAdapter <News>{

    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News news = getItem(position);
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
//        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (news != null) {
            titleView.setText(news.getNewsTitle());
//            descriptionView.setText(news.getNewsDescription());
            imageView.setImageBitmap(news.getImageBitmap());
        }



        return  listItemView;
    }


}
