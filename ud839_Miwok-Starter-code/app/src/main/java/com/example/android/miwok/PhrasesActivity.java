package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        final ArrayList<CustomWord> phrases = new ArrayList<>();
        phrases.add(new CustomWord("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        phrases.add(new CustomWord("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        phrases.add(new CustomWord("My name is..","oyaaset",R.raw.phrase_my_name_is));
        phrases.add(new CustomWord("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        phrases.add(new CustomWord("I'm feeling good","kuchi achit",R.raw.phrase_im_feeling_good));
        phrases.add(new CustomWord("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        phrases.add(new CustomWord("Yes, I'm coming","hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phrases.add(new CustomWord("I'm coming","әәnәm",R.raw.phrase_im_coming));
        phrases.add(new CustomWord("Les GOOOO","yoowutis",R.raw.phrase_lets_go));
        phrases.add(new CustomWord("Come Here","әnni'nem",R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this,phrases, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CustomWord customWord = phrases.get(i);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, customWord.getAudioId());
                mediaPlayer.start();
            }
        });



    }
}