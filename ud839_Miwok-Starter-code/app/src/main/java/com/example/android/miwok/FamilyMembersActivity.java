package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        ArrayList<CustomWord> familyMembers = new ArrayList<>();
        familyMembers.add(new CustomWord("Father","әpә",R.drawable.family_father));
        familyMembers.add(new CustomWord("Mother","әṭa",R.drawable.family_mother));
        familyMembers.add(new CustomWord("Son","angsi",R.drawable.family_son));
        familyMembers.add(new CustomWord("Daughter","tune",R.drawable.family_daughter));
        familyMembers.add(new CustomWord("Older Brother","taachi",R.drawable.family_older_brother));
        familyMembers.add(new CustomWord("Younger Brother","chalitti",R.drawable.family_younger_brother));
        familyMembers.add(new CustomWord("Older Sister","teṭe",R.drawable.family_older_sister));
        familyMembers.add(new CustomWord("Younger Sister","kolliti",R.drawable.family_younger_sister));
        familyMembers.add(new CustomWord("Grand Ma","ama",R.drawable.family_grandmother));
        familyMembers.add(new CustomWord("Grand Pa","paapa",R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,familyMembers, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}