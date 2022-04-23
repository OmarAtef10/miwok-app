package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<CustomWord> nums = new ArrayList<>();
        nums.add(new CustomWord("One","lutti",R.drawable.number_one));
        nums.add(new CustomWord("Two","otiiko",R.drawable.number_two));
        nums.add(new CustomWord("Three","tolookosu",R.drawable.number_three));
        nums.add(new CustomWord("Four","oyyisa",R.drawable.number_four));
        nums.add(new CustomWord("Five","massokka",R.drawable.number_five));
        nums.add(new CustomWord("Six","temmokka",R.drawable.number_six));
        nums.add(new CustomWord("Seven","kenekaku",R.drawable.number_seven));
        nums.add(new CustomWord("Eight","kawinta",R.drawable.number_eight));
        nums.add(new CustomWord("Nine","wo'e",R.drawable.number_nine));
        nums.add(new CustomWord("Ten","na'aacha",R.drawable.number_ten));



        WordAdapter itemsAdapter = new WordAdapter(this,nums,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}