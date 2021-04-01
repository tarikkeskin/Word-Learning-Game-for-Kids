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

public class ColorActivity extends AppCompatActivity {

    final Random rnd = new Random();

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        final ImageView img = (ImageView) findViewById(R.id.image_color);
        // I have 3 images named img_0 to img_2, so...
        int random = rnd.nextInt(5);
        final String str = "imgcolor_" + random;
        img.setImageDrawable(getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));

        TextView myAwesomeTextView = (TextView) findViewById(R.id.textcolor);

        switch(random) {
            case 0:
                myAwesomeTextView.setText("Black");
                break;
            case 1:
                myAwesomeTextView.setText("Blue");
                break;
            case 2:
                myAwesomeTextView.setText("Orange");
                break;
            case 3:
                myAwesomeTextView.setText("Red");
                break;
            case 4:
                myAwesomeTextView.setText("Yellow");
                break;
        }


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
    public void goNextColor(View view){
        finish();
        startActivity(getIntent());
    }
}