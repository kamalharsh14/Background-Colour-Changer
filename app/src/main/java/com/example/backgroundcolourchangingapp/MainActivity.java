package com.example.backgroundcolourchangingapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int currcolour = R.color.black;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        b.setBackgroundColor(getColor(R.color.white));
        ConstraintLayout body = findViewById(R.id.body);
        b.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                if(currcolour == R.color.red){
                    currcolour = R.color.green;
                }
                else if(currcolour == R.color.green){
                    currcolour = R.color.blue;
                }
                else{
                    currcolour = R.color.red;
                }
                body.setBackgroundColor(getColor(currcolour));
            }
        });

    }
}