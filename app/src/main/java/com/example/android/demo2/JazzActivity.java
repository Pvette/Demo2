package com.example.android.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    private Button mbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        findViews();

        //Create an array of albums
        ArrayList<Album> albums = new ArrayList<Album>();

        //albums.add("one");

        albums.add(new Album("Blue Train","John Coltrane"));
        albums.add(new Album("The Sidewinder","Lee Morgan"));
        albums.add(new Album("The Turnaround!", "Hank Mobley"));
        albums.add(new Album("Be Good", "Gregory Porter"));
        albums.add(new Album("Moanin", "Art Blakely"));
        // words.add(new Word("six", "temmokka"));
        //words.add(new Word("seven", "kenekaku"));
        // words.add(new Word("eight", "kawinta"));
        // words.add(new Word("nine", "wo'e"));
        //  words.add(new Word("ten", "na'aacha"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView wordView = new TextView(this);


        mbackButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(JazzActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

    }

        private void findViews() {
            mbackButton = (Button) findViewById(R.id.back);
        }
}



