package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student("يوسف",14,12,R.drawable.student);
        Student s2 = new Student("سلمان",13,10,R.drawable.student1);
        Student s3 = new Student("ماجد",15,11,R.drawable.student1);

        students.add(s1);
        students.add(s2);
        students.add(s3);

    }
}