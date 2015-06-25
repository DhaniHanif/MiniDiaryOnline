package com.example.dhani.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class SecondActivity extends ActionBarActivity {

    private DiaryDbAdapter mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);


        mDbHelper = new DiaryDbAdapter(this);
        mDbHelper.open();
    }

    public void openNewDiary(View view) {

        Intent intent = new Intent(this, NewDiary.class);
        startActivity(intent);
    }

    public void openHistory(View view) {

        Intent intent = new Intent(this, DiaryHistory.class);
        startActivity(intent);
    }

    public void  openAbout(View view) {

        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void close(View view) {
        // Do something in response to button
        finish();
        System.exit(0);
    }

}
