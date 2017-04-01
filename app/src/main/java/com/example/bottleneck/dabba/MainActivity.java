package com.example.bottleneck.dabba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText namefield, emailidfield, contactnofield, passwordfield, addressfield;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        namefield = (EditText) findViewById(R.id.namefield);
        emailidfield = (EditText) findViewById(R.id.emailid);
        contactnofield = (EditText) findViewById(R.id.contactnumber);
        passwordfield = (EditText) findViewById(R.id.password);
        addressfield = (EditText) findViewById(R.id.Addressbox);
        signup = (Button) findViewById(R.id.signupbtn);
    }

    public void signclicked(View view) {
        Intent intent = new Intent(this, Dabbawala.class);
        intent.putExtra("name", namefield.getText());
        startActivity(intent);
    }
}
