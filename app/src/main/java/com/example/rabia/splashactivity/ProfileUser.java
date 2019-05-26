package com.example.rabia.splashactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileUser extends AppCompatActivity {
    EditText email,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_user);
//        email=(EditText)findViewById(R.id.emailProfile);
//        pass=(EditText)findViewById(R.id.passProfile);
//            Bundle bundle=getIntent().getExtras();
//            String email1=bundle.getString("k1");
//            String pass1=bundle.getString("k2");
//            Toast.makeText(this,"email1" + email1,Toast.LENGTH_SHORT).show();
//            Toast.makeText(this,"password" +pass1 ,Toast.LENGTH_SHORT).show();
//           email.setText(email1);
//            pass.setText(pass1);

    }
}
