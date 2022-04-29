package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<CustomWord> familyMembers = new ArrayList<>();
        familyMembers.add(new CustomWord("Father", "әpә", R.drawable.family_father, R.raw.family_father));
        familyMembers.add(new CustomWord("Mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        familyMembers.add(new CustomWord("Son", "angsi", R.drawable.family_son, R.raw.family_son));
        familyMembers.add(new CustomWord("Daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        familyMembers.add(new CustomWord("Older Brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyMembers.add(new CustomWord("Younger Brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyMembers.add(new CustomWord("Older Sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyMembers.add(new CustomWord("Younger Sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyMembers.add(new CustomWord("Grand Ma", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyMembers.add(new CustomWord("Grand Pa", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this, familyMembers, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CustomWord customWord = familyMembers.get(i);
                mediaPlayer = MediaPlayer.create(FamilyMembersActivity.this, customWord.getAudioId());
                mediaPlayer.start();
            }
        });



    }
}