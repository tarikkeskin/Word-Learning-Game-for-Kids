package com.tictactoe.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goAnimalActivity(View view){

        Intent intent = new Intent(this,AnimalActivity.class);

        startActivity(intent);
    }
    public void goColorsActivity(View view){

        Intent intent = new Intent(this,ColorActivity.class);

        startActivity(intent);
    }
    public void goExercisesActivity(View view){

        Intent intent = new Intent(this,ExercisesActivity.class);

        startActivity(intent);
    }
}