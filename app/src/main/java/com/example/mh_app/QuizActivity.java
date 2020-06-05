package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary= new QuestionLibrary ();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mExitButton;

    private String mAnswer;
    private  int mScore=0;
    private int mQuestionNumber=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.questions);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mExitButton=(Button)findViewById(R.id.Exit_Quiz);

        updateQuestion();

        //start of Button listener button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic for button
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);

                    //Check to see for last question
                    if(mQuestionNumber==QuestionLibrary.nQuestions.length){
                        Intent i= new Intent(QuizActivity.this,ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("Final Score",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);


                    }
                    else{
                        updateQuestion();
                        // Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    } //else{
                    //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    //updateQuestion();

                }
                else{
                    if(mQuestionNumber==QuestionLibrary.nQuestions.length){
                        Intent i= new Intent(QuizActivity.this,ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("Final Score",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);


                    }
                    else{
                        updateQuestion();
                        // Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });

        //end of Button listener button1

        //start of Button listener button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic for button
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);


                    //Check to see for last question
                    if(mQuestionNumber==QuestionLibrary.nQuestions.length){
                        Intent i= new Intent(QuizActivity.this,ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("Final Score",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);


                    }
                    else{
                        updateQuestion();


                        //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    } //else{
                    // Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    //updateQuestion();

                }
                else{
                    if(mQuestionNumber==QuestionLibrary.nQuestions.length){
                        Intent i= new Intent(QuizActivity.this,ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("Final Score",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);


                    }
                    else{
                        updateQuestion();
                        // Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }


                }


            }
        });

        //end of Button listener button2

        //start of Button listener button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic for button
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);

                    //Check to see for last question
                    if(mQuestionNumber==QuestionLibrary.nQuestions.length){
                        Intent i= new Intent(QuizActivity.this,ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("Final Score",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);


                    }
                    else{
                        updateQuestion();

                        //Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    } //else{
                    //Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    //updateQuestion();

                }
                else{
                    if(mQuestionNumber==QuestionLibrary.nQuestions.length){
                        Intent i= new Intent(QuizActivity.this,ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("Final Score",mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);



                    }
                    else{
                        updateQuestion();
                        // Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });

        //end of Button listener button3

        mExitButton.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View view){
                //final AlertDialog.Builder builder= new AlertDialog.Builder(QuizActivity.this);
                //builder.setTitle("Exit");
                // builder.setMessage("Do you want to exit?");
                // builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                //@Override

                // public void onClick(DialogInterface dialogInterface, int i){

                finish();
            }
        });
        //builder.setNegativeButton("Not now",new DialogInterface.OnClickListener(){
        // @Override
        //  public void onClick(DialogInterface dialogInterface, int i){
        //dialogInterface.dismiss();
    }

    //}
    //);
    // AlertDialog dialog= builder.create();

    //}

    //});
    // }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer=mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }


    private void updateScore(int point){
        mScoreView.setText("" + mScore);
    }
}



