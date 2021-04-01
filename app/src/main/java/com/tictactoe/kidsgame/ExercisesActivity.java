package com.tictactoe.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ExercisesActivity extends AppCompatActivity {

    final Random rnd = new Random();
    int randomcategory = rnd.nextInt(2);
    int random;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        EditText simpleEditText = (EditText) findViewById(R.id.editexercises);


        Button buttonExercises = (Button) findViewById(R.id.buttonexercises);

        final ImageView img = (ImageView) findViewById(R.id.imageexercises);
        // I have 3 images named img_0 to img_2, so...


        if (randomcategory==0){

            random= rnd.nextInt(7);
            final String str = "imganimal_" + random;

            img.setImageDrawable(getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));
/*
            switch(random) {
                case 0:
                    if(strValue=="Dog"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();

                    break;
                case 1:
                    if(strValue=="monkey"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    if(strValue=="horse"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 3:
                    if(strValue=="elephant"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 4:
                    if(strValue=="cat"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    if(strValue=="bird"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();

                    break;
                case 6:
                    if(strValue=="turtle"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
            }

 */
        }
        else{

            random= rnd.nextInt(5);
            final String str = "imgcolor_" + random;
            img.setImageDrawable(getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));

            /*
            switch(random) {
                case 0:
                    if(strValue=="black"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    if(strValue=="blue"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    if(strValue=="orange"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 3:
                    if(strValue=="red"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
                case 4:
                    if(strValue=="yellow"||strValue=="dog") Toast.makeText(this,"TURE",Toast.LENGTH_LONG).show();
                    break;
            }


             */
        }

        buttonExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strValue = simpleEditText.getText().toString();

                System.out.println(strValue);

                finish();
                startActivity(getIntent());

            }
        });



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

}