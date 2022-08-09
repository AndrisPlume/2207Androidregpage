package com.example.a2207androidregpage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Izveidojam ArrayList
    ArrayList<EditText> textbox = new ArrayList<>();

    public void submit (View view){

        textbox.add(findViewById(R.id.editTextTextPersonName2));             //pieveinojam editText objektus ArrayList
        TextView username = findViewById(R.id.Username);                     //definējam  TextBox mainīgo
        username.setText("Username: "+ textbox.get(0).getText().toString()); //piešķiram TextView objektiem ievadītās vērtības

        textbox.add(findViewById(R.id.editTextTextEmailAddress));
        TextView email = findViewById(R.id.Email);
        email.setText("Email: "+ textbox.get(1).getText().toString());


        textbox.add(findViewById(R.id.editTextPhone));
        TextView phone = findViewById(R.id.Phone);
        phone.setText("Phone: "+ textbox.get(2).getText().toString());

        textbox.add(findViewById(R.id.editTextTextPostalAddress));
        TextView city = findViewById(R.id.City);
        city.setText("City: "+ textbox.get(3).getText().toString());

        textbox.add(findViewById(R.id.editTextTextPassword));
        TextView password = findViewById(R.id.Password);
        password.setText("Password: "+ textbox.get(4).getText().toString());


        for (EditText e: textbox){ //pārrakstam vērtības ievades laukiem
            e.setText("");


        }


    }

}