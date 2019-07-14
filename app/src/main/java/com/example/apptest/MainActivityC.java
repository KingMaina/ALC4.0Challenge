package com.example.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivityC extends AppCompatActivity {
    CircleImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);

        imageView = (CircleImageView) findViewById(R.id.profile_image);
    }
}
