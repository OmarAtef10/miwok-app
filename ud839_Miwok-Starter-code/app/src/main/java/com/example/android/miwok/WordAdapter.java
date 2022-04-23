package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<CustomWord> {
    private int resColor;

    public WordAdapter(@NonNull Context context, ArrayList<CustomWord> words, int color) {
        super(context, 0, words);
        this.resColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        CustomWord word = getItem(position);
        TextView miwok = (TextView) listViewItem.findViewById(R.id.miwok_text_view);
        miwok.setText(word.getMiwokTranslation());
        TextView defaultLang = (TextView) listViewItem.findViewById(R.id.default_text_view);
        defaultLang.setText(word.getDefaultTranslation());
        ImageView imageView = (ImageView) listViewItem.findViewById(R.id.image);
        if (word.hasImg()) {
            imageView.setImageResource(word.getImgID());
            imageView.setVisibility(View.VISIBLE);

        } else {
            imageView.setVisibility(View.GONE);
        }
        int color = ContextCompat.getColor(getContext(),resColor);
        listViewItem.setBackgroundColor(color);
        return listViewItem;
    }
}
