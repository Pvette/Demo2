package com.example.android.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    private Button mbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pop);

        findViews();

        //Create an array of pop albums
        ArrayList<Album> albums = new ArrayList<Album>();
        //words.add("one");

        albums.add(new Album("Happiness Begins","Jonas Brothers"));
        albums.add(new Album("Diamonds","Elton John"));
        albums.add(new Album("Coconut Oil", "Lizzo"));
        albums.add(new Album("Madame X", "Madonna"));
        albums.add(new Album("Share My World", "Mary J Blige"));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView albumView = new TextView(this);

        mbackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(PopActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

    }

    private void findViews() {
        mbackButton = (Button) findViewById(R.id.back);

    }

}


