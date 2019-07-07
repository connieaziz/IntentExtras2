package com.example.itentextras2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    Button btnSend;
    String name;
    String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener((v) {

                name = etName.getText().toString();
                age = etAge.getText().toString();
                Intent myIntent = new Intent(getBaseContext(), RecieveActivity.class);
                String name = etName.getText().toString();
                String age = etAge.getText().toString();
                myIntent.putExtra("etName", name);
                myIntent.putExtra("etAge", age);
                startActivity(myIntent);

                FloatingActionButton fab = findViewById(R.id.fab);
                fab.setOnClickListener((view));
                startActivity(new Intent());


                });

        }};
    }

}

