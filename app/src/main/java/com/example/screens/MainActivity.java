package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startaAndraMainKnappen = findViewById(R.id.startSecondActivity);

        startaAndraMainKnappen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View niceViewOpener) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", "Ett värde som skickas med från MainActivity.java");
                startActivity(intent);
            }
        });
    }
}
