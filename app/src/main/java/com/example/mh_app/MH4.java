package com.example.mh_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MH4 extends AppCompatActivity {

    EditText mFirstName,mLastName,mEmail,mPassword,mRetypePassword;
    Button mRegisterBtn;
    FirebaseAuth fAuth;

    ProgressBar progressbar;
    public void progress (View view){
        progressbar = findViewById(R.id.progressBar1);
        progressbar.setVisibility(View.VISIBLE);

    }

   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_h4);

        mFirstName = findViewById(R.id.first_name);
        mEmail = findViewById(R.id.email);
        mLastName = findViewById(R.id.last_name);
        mPassword = findViewById(R.id.password);
        mRetypePassword = findViewById(R.id.retype_password);

        mRegisterBtn =  findViewById(R.id.register_button);

        fAuth = FirebaseAuth.getInstance();



        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                String retype_password = mRetypePassword.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email field cannot be empty");
                    return;
                }
                if(!password.equals(retype_password))
                {
                    mRetypePassword.setError("The passwords don't match");
                }
                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password field cannot be empty");
                    return;
                }

                if(password.length() < 6){
                    mPassword.setError("Password must be greater than 6 characters long");
                    return;
                }
                //progressbar.setVisibility(View.VISIBLE);

                //Register the user



                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MH4.this,"User Created",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),MH2.class));
                        }else{
                            Toast.makeText(MH4.this,"Error : " + task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }

}
