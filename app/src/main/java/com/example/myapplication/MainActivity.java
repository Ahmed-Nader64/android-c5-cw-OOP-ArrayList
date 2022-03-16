package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student item1 = new Student("Ahmed",16,10,R.drawable.student);
        Student item2 = new Student("Omar",17,11,R.drawable.student1);
        

    }
}