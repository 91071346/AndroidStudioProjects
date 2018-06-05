package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener
{
    Button buttonBackyardObject;
    Button buttonTolietObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        buttonBackyardObject = findViewById(R.id.buttonLeftBackyard);
        buttonTolietObject = findViewById(R.id.buttonRightToliet);
        buttonBackyardObject.setOnClickListener(this);
        buttonTolietObject.setOnClickListener(this);
    }

    public void onClick (View v)
    {
        if (v.getId() == R.id.buttonLeftBackyard)
        {
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.buttonRightToliet)
        {
            Intent i = new Intent(this, TolietActivity.class);
            startActivity(i);
        }
    }
}
