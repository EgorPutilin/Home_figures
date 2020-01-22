package com.example.phonetrianglesqare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.phonetrianglesqare.figures.Triangle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Triangle triangle = new Triangle();

        triangle.getArea(2, 3, 4, 4, 5 );

    }
}
