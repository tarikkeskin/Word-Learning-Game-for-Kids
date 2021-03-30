package com.tictactoe.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class AnimalActivity extends AppCompatActivity {





    final Random rnd = new Random();

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_animal);

        setContentView(R.layout.activity_animal);

        final ImageView img = (ImageView) findViewById(R.id.image_animal);
        // I have 3 images named img_0 to img_2, so...
        final String str = "imganimal_" + rnd.nextInt(2);
        img.setImageDrawable
                (getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));

        // globally
        TextView myAwesomeTextView = (TextView) findViewById(R.id.textanimal);
        //in your OnCreate() method
        myAwesomeTextView.setText("My Awesome Text");

    }

    protected final static int getResourceID
            (final String resName, final String resType, final Context ctx)
    {
        final int ResourceID =
                ctx.getResources().getIdentifier(resName, resType,
                        ctx.getApplicationInfo().packageName);
        if (ResourceID == 0)
        {
            throw new IllegalArgumentException
                    (
                            "No resource string found with name " + resName
                    );
        }
        else
        {
            return ResourceID;
        }
    }
    public void goNextPicture(View view){

        Intent intent = new Intent(this,AnimalActivity.class);

        startActivity(intent);
    }
}