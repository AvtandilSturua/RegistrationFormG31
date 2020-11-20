package com.example.registrationformg31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onButton(View view){
        Intent LoginFormIntent = new Intent(this, LoginForm.class);
        startActivity(LoginFormIntent);

    }

    public void onButton2(View view){
        Intent RegistrationFormIntent = new Intent(this,RegistrationForm.class);
        startActivity(RegistrationFormIntent);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}