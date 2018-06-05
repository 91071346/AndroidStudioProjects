package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TolietActivity extends AppCompatActivity implements View.OnClickListener
{
Button yesObject;
Button heckYesObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toliet);

        yesObject=findViewById(R.id.buttonYes);
        heckYesObject=findViewById(R.id.buttonHeckYes);
        yesObject.setOnClickListener(this);
        heckYesObject.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId()==R.id.buttonYes)
        {
            Intent i = new Intent(this, Yes.class);
            startActivity(i);
        }
        else if (view.getId()==R.id.buttonHeckYes)
        {
            Intent i = new Intent(this, HeckYes.class);
            startActivity(i);
        }

    }
}
