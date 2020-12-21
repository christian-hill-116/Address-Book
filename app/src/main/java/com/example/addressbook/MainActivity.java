package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   private Button add, remove, edit, display, sort, search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.button);
        remove = (Button) findViewById(R.id.button2);
        edit = (Button) findViewById(R.id.button3);
        display = (Button) findViewById(R.id.button4);
        sort = (Button) findViewById(R.id.button5);
        search = (Button) findViewById(R.id.button6);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdd();
            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDisplay();
            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEdit();
            }
        });
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRemove();
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSort();
            }
        });


    }

    private void openSort() {
        Intent intent = new Intent(this, SortContact.class);
        startActivity(intent);
    }

    private void openSearch() {
        Intent intent = new Intent(this, SearchContact.class);
        startActivity(intent);
    }

    private void openRemove() {
        Intent intent = new Intent(this, RemoveContact.class);
        startActivity(intent);
    }

    private void openEdit() {
        Intent intent = new Intent(this, EditContact.class);
        startActivity(intent);
    }

    public void openDisplay() {
        Intent intent = new Intent(this, DisplayContacts.class);
        startActivity(intent);
    }

    public void openAdd() {
        Intent intent = new Intent(this, AddContact.class);
        startActivity(intent);
    }






    }
