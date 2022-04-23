package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<CustomWord> phrases = new ArrayList<>();
        phrases.add(new CustomWord("Where are you going?","minto wuksus"));
        phrases.add(new CustomWord("What is your name?","tinnә oyaase'nә"));
        phrases.add(new CustomWord("My name is..","oyaaset"));
        phrases.add(new CustomWord("How are you feeling?","michәksәs?"));
        phrases.add(new CustomWord("I'm feeling good","kuchi achit"));
        phrases.add(new CustomWord("Are you coming?","әәnәs'aa?"));
        phrases.add(new CustomWord("Yes, I'm coming","hәә’ әәnәm"));
        phrases.add(new CustomWord("I'm coming","әәnәm"));
        phrases.add(new CustomWord("Les GOOOO","yoowutis"));
        phrases.add(new CustomWord("Come Here","әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this,phrases, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}