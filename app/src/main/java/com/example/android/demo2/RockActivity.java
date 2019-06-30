package com.example.android.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    private Button mbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        findViews();

        //Create an array of rock albums
        ArrayList<Album> albums = new ArrayList<Album>();

        //albums.add("one");

        albums.add(new Album("Western Stars","Bruce Springsteen"));
        albums.add(new Album("All Time Greatest Hits","Lynyrd Skynyrd"));
        albums.add(new Album("The Definitive Rod Stewart", "Rod Stewart"));
        albums.add(new Album("Hysteria", "Def Leppard"));
        albums.add(new Album("ATTENTION ATTENTION", "Shinedown"));
        //words.add(new Word("white", "kelelli"));
        //words.add(new Word("dusty yellow", "ṭopiisә"));
        //words.add(new Word("mustard yellow", "chiwiiṭә"));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView albumView = new TextView(this);

        mbackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RockActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

    }

    private void findViews() {
        mbackButton = (Button) findViewById(R.id.back);
    }
}
