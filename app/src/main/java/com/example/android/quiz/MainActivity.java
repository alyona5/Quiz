package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This app displays a quiz.
 */

public class MainActivity extends AppCompatActivity {

    EditText editName;
    RadioButton Question1;
    EditText Question2;
    RadioButton Question3;
    RadioButton Question4;
    RadioButton Question5;
    CheckBox Question6_1;
    CheckBox Question6_2;
    CheckBox Question6_3;
    CheckBox Question6_4;
    CheckBox Question6_5;
    CheckBox Question6_6;
    CheckBox Question6_7;
    EditText Question7;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the views

        editName = findViewById(R.id.edit_name);
        Question1 = findViewById(R.id.answer2_question1);
        Question2 = findViewById(R.id.answer_question2);
        Question3 = findViewById(R.id.answer4_question3);
        Question4 = findViewById(R.id.answer4_question4);
        Question5 = findViewById(R.id.answer2_question5);
        Question6_1 = findViewById(R.id.answer1_question6);
        Question6_2 = findViewById(R.id.answer2_question6);
        Question6_3 = findViewById(R.id.answer3_question6);
        Question6_4 = findViewById(R.id.answer4_question6);
        Question6_5 = findViewById(R.id.answer5_question6);
        Question6_6 = findViewById(R.id.answer6_question6);
        Question6_7 = findViewById(R.id.answer7_question6);
        Question7 = findViewById(R.id.answer_question7);
    }

    /**
     * This method is called when the submit button is clicked.
     *
     * @param view
     */

    public void submitQuiz(View view) {

        String userName = editName.getText().toString();

        boolean answer1 = Question1.isChecked();

        boolean answer3 = Question3.isChecked();

        boolean answer4 = Question4.isChecked();

        boolean answer5 = Question5.isChecked();

        String answer2 = Question2.getText().toString();

        String answer7 = Question7.getText().toString();

        boolean answer6_3 = Question6_3.isChecked();

        boolean answer6_6 = Question6_6.isChecked();

        boolean answer6_7 = Question6_7.isChecked();

        //awarding user with 1 point for each correct answer

        points = 0;

        if (answer1) {
            points = points + 1;
        }

        if (answer2.equalsIgnoreCase("U2")) {
            points = points + 1;
        }

        if (answer3) {
            points = points + 1;
        }

        if (answer4) {
            points = points + 1;
        }

        if (answer5) {
            points = points + 1;
        }


        if (!Question6_1.isChecked() && !Question6_2.isChecked() && Question6_3.isChecked() && !Question6_4.isChecked() && !Question6_5.isChecked()
                    && Question6_6.isChecked() && Question6_7.isChecked()){
            points = points +1;
        }

        if (answer7.equals("3")) {
            points = points + 1;
        }

        //Getting resources string for the toast message
        String Final1 = getResources().getString(R.string.Final1);

        String Final2 = getResources().getString(R.string.Final2);

        String Final3 = getResources().getString(R.string.Final3);

        // The result of the quiz shows up in a toast message.

        if (points == 7) {
            Toast.makeText(this, Final3, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, userName + Final1 + points + Final2, Toast.LENGTH_LONG).show();
        }
    }
}
