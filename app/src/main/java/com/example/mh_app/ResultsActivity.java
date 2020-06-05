package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    TextView mPoints, mFinalScore;
    Button mRetryButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mPoints=(TextView) findViewById(R.id.score);
        mFinalScore=findViewById(R.id.outOf);
        mRetryButton=(Button) findViewById(R.id.retry);

        Bundle bundle= getIntent().getExtras();
        int grades=bundle.getInt("Final Score");

        mFinalScore.setText("You scored " + grades + "  out of "+QuestionLibrary.nQuestions.length);

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this,QuizActivity.class));
                ResultsActivity.this.finish();
            }

        });
    }
}



