package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        ArrayList<CustomWord> phrases = new ArrayList<>();
        phrases.add(new CustomWord("Red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        phrases.add(new CustomWord("Green","chokokki",R.drawable.color_green,R.raw.color_green));
        phrases.add(new CustomWord("Blue","Blue lol",R.drawable.color_dusty_yellow,R.raw.phrase_im_coming));
        phrases.add(new CustomWord("White","kelelli",R.drawable.color_white,R.raw.color_white));
        phrases.add(new CustomWord("Black","kululli",R.drawable.color_black,R.raw.color_black));
        phrases.add(new CustomWord("Kos koza7","Skittles",R.drawable.family_daughter,R.raw.phrase_im_coming));

        WordAdapter itemsAdapter = new WordAdapter(this,phrases, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CustomWord customWord = phrases.get(i);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, customWord.getAudioId());
                mediaPlayer.start();
            }
        });

    }
}