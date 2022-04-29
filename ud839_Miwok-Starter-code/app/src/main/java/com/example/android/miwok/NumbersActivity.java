package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<CustomWord> nums = new ArrayList<>();
        nums.add(new CustomWord("One", "lutti", R.drawable.number_one, R.raw.number_one));
        nums.add(new CustomWord("Two", "otiiko", R.drawable.number_two, R.raw.number_two));
        nums.add(new CustomWord("Three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        nums.add(new CustomWord("Four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        nums.add(new CustomWord("Five", "massokka", R.drawable.number_five, R.raw.number_five));
        nums.add(new CustomWord("Six", "temmokka", R.drawable.number_six, R.raw.number_six));
        nums.add(new CustomWord("Seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        nums.add(new CustomWord("Eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        nums.add(new CustomWord("Nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        nums.add(new CustomWord("Ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(this, nums, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CustomWord customWord = nums.get(i);
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, customWord.getAudioId());
                mediaPlayer.start();
            }
        });

    }
}