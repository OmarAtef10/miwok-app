package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<CustomWord> phrases = new ArrayList<>();
        phrases.add(new CustomWord("Red","weṭeṭṭi",R.drawable.color_red));
        phrases.add(new CustomWord("Green","chokokki",R.drawable.color_green));
        phrases.add(new CustomWord("Blue","Blue lol",R.drawable.color_dusty_yellow));
        phrases.add(new CustomWord("White","kelelli",R.drawable.color_white));
        phrases.add(new CustomWord("Black","kululli",R.drawable.color_black));
        phrases.add(new CustomWord("Kos koza7","Skittles",R.drawable.family_daughter));

        WordAdapter itemsAdapter = new WordAdapter(this,phrases, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}