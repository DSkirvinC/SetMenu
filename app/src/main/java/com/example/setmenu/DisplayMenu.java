package com.example.setmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_menu);
        Intent intent = getIntent();
        String breakfasttime = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView Breakfast = findViewById(R.id.textView8);
        Breakfast.setText(breakfasttime);
        String lunchtime = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        TextView lunch = findViewById(R.id.textView9);
        lunch.setText(lunchtime);
        String dinnertime = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        TextView dinner = findViewById(R.id.textView10);
        dinner.setText(dinnertime);
    }
}
