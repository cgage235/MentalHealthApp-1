package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MH3 extends AppCompatActivity {
    private Button buttonSign;
    private Button buttonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_h3);

       buttonReg =(Button) findViewById(R.id.reg);
        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityFour();
             }
        });

                buttonSign=(Button)findViewById(R.id.SignIn);
        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                moveToActivityTwo();
            }

        });

    }




    private  void moveToActivityTwo(){
        Intent intent=new Intent(MH3.this,MH2.class);
        startActivity(intent);

    }

    private  void moveToActivityFour(){
        Intent intent=new Intent(MH3.this,MH4.class);
        startActivity(intent);

    }

}

