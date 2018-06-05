package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FaintActivity extends AppCompatActivity implements View.OnClickListener
{
    Button buttonRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        buttonRestart = findViewById(R.id.buttonRestart);
        buttonRestart.setOnClickListener(this);

    }

    public void onClick (View view)
    {
        if (view.getId() == R.id.buttonRestart)
        {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
    }
}