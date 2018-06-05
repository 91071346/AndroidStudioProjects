package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener
{
    Button buttonScreamObject;
    Button buttonFaintObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        buttonScreamObject = findViewById(R.id.buttonLeftScream);
        buttonFaintObject  = findViewById(R.id.buttonRightFaint);
        buttonScreamObject.setOnClickListener(this);
        buttonFaintObject.setOnClickListener(this);
    }
    public void onClick (View view)
    {
        if (view.getId()==R.id.buttonLeftScream)
        {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
        else if (view.getId()==R.id.buttonRightFaint)
        {
            Intent i = new Intent(this, FaintActivity.class);
            startActivity(i);
        }
    }
}
