package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayContacts extends AppCompatActivity {

    ListView listOfNames;
    ArrayAdapter ad;
    List<String> friends = new ArrayList<>();
    String[] friendsList = {"Alpha", "Bravo", "Charlie", "Delta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contacts);

        listOfNames = findViewById(R.id.listView);

        friends = new ArrayList<String>(Arrays.asList(friendsList));
        ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, friends);

        listOfNames.setAdapter(ad);
    }
}