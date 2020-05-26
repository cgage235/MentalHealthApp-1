package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button divein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        divein =findViewById(R.id.DiveIn);
        divein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityThree();
            }
        });

    }

    private  void moveToActivityThree(){
        Intent intent=new Intent(MainActivity.this,MH3.class);
        startActivity(intent);
    }
}
