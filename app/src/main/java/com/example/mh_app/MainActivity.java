package com.example.mh_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

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
//                if(fAuth.getCurrentUser() != null)
//                {  // If the user is already logged in then send the user to the specified page
//                    startActivity(new Intent(getApplicationContext(),MH2.class));
//                    finish();
//                }
//                else{
//                moveToActivityThree();}
                moveToActivityThree();
            }
        });

    }

    private  void moveToActivityThree(){
        Intent intent=new Intent(MainActivity.this,MH3.class);
        startActivity(intent);
    }
}
