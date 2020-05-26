package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MH3 extends AppCompatActivity {
    private Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_h3);


        signin =findViewById(R.id.SignIn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTwo();
            }
        });

    }

    private  void moveToActivityTwo(){
        Intent intent=new Intent(MH3.this,MH2.class);
        startActivity(intent);
    }
}

