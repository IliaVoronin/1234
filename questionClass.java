package com.example.voronin.numbergame;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import static android.view.View.*;



public class questionsClass extends ActionBarActivity {

    endGameClass endGameClass = new endGameClass();
    generateMethod generateMethod = new generateMethod();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_questions);

        //НАЧАЛЬНАЯ ГЕНЕРАЦИЯ ЧИСЕЛ
        final TextView textViewMain= (TextView) findViewById(R.id.textViewQuestion);
        final int Answer = 0;
        generateMethod.genAndFill(textViewMain);

        ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton6);

        final TextView twScore = (TextView) findViewById(R.id.textView2);
        twScore.setText("0");

        final int one = 1;
        final int two = 2;
        final int three = 3;

        //ЛИСТЕНЕР ДЛЯ КНОПОК 1 2 3

        OnClickListener onClickListener1 = new OnClickListener() {

            int score;

            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.imageButton4) {
                    if (String.valueOf(one) == String.valueOf(generateMethod.getStepTwo())){
                        generateMethod.genAndFill(textViewMain);
                        score++;
                        twScore.setText(String.valueOf(score));
                    }
                    else {
                        endGameClass.setScore(score);
                        finish();
                        startActivity(new Intent(getApplicationContext(), endGameClass.class));
                    }
                }
                if (v.getId() == R.id.imageButton5) {
                    if (String.valueOf(two) == String.valueOf(generateMethod.getStepTwo())){
                        generateMethod.genAndFill(textViewMain);
                        score++;
                        twScore.setText(String.valueOf(score));
                    }
                    else {
                        endGameClass.setScore(score);
                        finish();
                        startActivity(new Intent(getApplicationContext(),endGameClass.class));
                    }
                }
                if (v.getId() == R.id.imageButton6) {
                    if (String.valueOf(three) == String.valueOf(generateMethod.getStepTwo())){
                        generateMethod.genAndFill(textViewMain);
                        score++;
                        twScore.setText(String.valueOf(score));
                    }
                    else {
                        endGameClass.setScore(score);
                        finish();
                        startActivity(new Intent(getApplicationContext(),endGameClass.class));
                    }
                }
            }

        };

        imageButton1.setOnClickListener(onClickListener1);
        imageButton2.setOnClickListener(onClickListener1);
        imageButton3.setOnClickListener(onClickListener1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_layout_questions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
