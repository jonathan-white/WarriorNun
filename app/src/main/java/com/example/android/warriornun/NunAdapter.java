package com.example.android.warriornun;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NunAdapter extends ArrayAdapter {

    public NunAdapter(@NonNull Context context, @NonNull ArrayList<Nun> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemListView = convertView;
        if (itemListView == null) {
            itemListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Obtain the current nun
        Nun currentNun = (Nun) getItem(position);

        //Obtain the ID of the TextView that will be used display the nun's name and set the name
        TextView nameTextView = (TextView) itemListView.findViewById(R.id.nun_name_text_view);
        nameTextView.setText(currentNun.getName());

        //Obtain the ID of the ImageView that will be used display the nun's avatar and set the image
        ImageView imageTextView = (ImageView) itemListView.findViewById(R.id.nun_image_text_view);
        imageTextView.setImageResource(currentNun.getThumbnail());


        return itemListView;
    }
}
