package com.example.palmdigital.buttontologcat01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButtonObject1 = (Button)findViewById(R.id.button1);

        myButtonObject1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Log.i("info", "Hi there!");
        Toast.makeText(this, "TIDE PODS", Toast.LENGTH_SHORT ).show();
    }
}
