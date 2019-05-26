package com.example.rabia.splashactivity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        email=(EditText)findViewById(R.id.email);
//        pass=(EditText)findViewById(R.id.pass);
       // Toast.makeText(this,"hi",Toast.LENGTH_SHORT).show();
    }

    public void LogIn(View view)
    {
        Intent intent=new Intent(this,ProfileUser.class);
        Bundle bundle=new Bundle();
        bundle.putString("k1",email.getText().toString());
        bundle.putString("k2",pass.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
