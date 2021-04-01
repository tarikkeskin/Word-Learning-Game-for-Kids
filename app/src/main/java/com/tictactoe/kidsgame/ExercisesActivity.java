package com.tictactoe.kidsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
    int randomanimal;
    int secs = 2;


    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        EditText simpleEditText = (EditText) findViewById(R.id.editexercises);

        TextView scoreText = (TextView) findViewById(R.id.scoretext);


        Intent intent2 =getIntent();
        final int[] score = {intent2.getIntExtra("score", 0)};

        scoreText.setText("Score : "+ score[0]);


        Button buttonExercises = (Button) findViewById(R.id.buttonexercises);

        final ImageView img = (ImageView) findViewById(R.id.imageexercises);
        // I have 3 images named img_0 to img_2, so...


        if (randomcategory==0){

            random= rnd.nextInt(7);
            randomanimal=random;
            final String str = "imganimal_" + random;

            img.setImageDrawable(getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));

        }
        else{

            random= rnd.nextInt(5);
            randomanimal=random;
            final String str = "imgcolor_" + random;
            img.setImageDrawable(getResources().getDrawable(getResourceID(str, "drawable", getApplicationContext())));

        }

        buttonExercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strValue = simpleEditText.getText().toString();

                if(randomcategory==0){

                    switch(randomanimal) {
                        case 0:
                            if(strValue.equals("Dog") || strValue.equals("dog")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });


                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 1:
                            if(strValue.equals("monkey") || strValue.equals("Monkey")) {
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 2:
                            if(strValue.equals("horse") || strValue.equals("Horse")) {
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 3:
                            if(strValue.equals("elephant") || strValue.equals("Elephant")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 4:
                            if(strValue.equals("cat") || strValue.equals("Cat")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 5:
                            if(strValue.equals("bird") || strValue.equals("Bird")) {
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 6:
                            if(strValue.equals("turtle") || strValue.equals("Turtle")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();
                            }
                            break;
                    }
                }
                else{
                    switch(randomanimal) {
                        case 0:
                            if(strValue.equals("black") || strValue.equals("Black")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }

                            break;
                        case 1:
                            if(strValue.equals("blue") || strValue.equals("Blue")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 2:
                            if(strValue.equals("orange") || strValue.equals("Orange")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 3:
                            if(strValue.equals("red") || strValue.equals("Red")){
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();

                            }
                            break;
                        case 4:
                            if(strValue.equals("yellow") || strValue.equals("Yellow")) {
                                Toast.makeText(getBaseContext(), "Your answer is correct!" , Toast.LENGTH_LONG ).show();
                                score[0]++;

                                Utils.delay(secs, new Utils.DelayCallback() {
                                    @Override
                                    public void afterDelay() {
                                        Intent intent = new Intent(ExercisesActivity.this,ExercisesActivity.class);
                                        intent.putExtra("score", score[0]);
                                        finish();
                                        startActivityForResult(intent,1);
                                    }
                                });
                            }
                            else{
                                Toast.makeText(getBaseContext(), "Try Again PLEASE :)" , Toast.LENGTH_LONG ).show();
                            }
                            break;
                    }


                }



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
    public static class Utils {

        // Delay mechanism

        public interface DelayCallback{
            void afterDelay();
        }

        public static void delay(int secs, final DelayCallback delayCallback){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    delayCallback.afterDelay();
                }
            }, secs * 1000); // afterDelay will be executed after (secs*1000) milliseconds.
        }
    }

}