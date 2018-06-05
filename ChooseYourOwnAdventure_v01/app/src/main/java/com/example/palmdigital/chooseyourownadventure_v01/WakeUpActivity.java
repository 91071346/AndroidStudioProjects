package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WakeUpActivity extends AppCompatActivity implements View.OnClickListener
{
    Button restart2Object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        restart2Object=findViewById(R.id.buttonRestart2);
        restart2Object.setOnClickListener(this);
    }
    public void onClick (View view)
    {
        if (view.getId() == R.id.buttonRestart2)
        {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
    }
}
