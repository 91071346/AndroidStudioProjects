package com.example.palmdigital.buttonchallege01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public Button buttonObject1;
    public Button buttonObject2;
    public Button buttonObject3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonObject1 = findViewById(R.id.button1);
        buttonObject2 = findViewById(R.id.button2);
        buttonObject3 = findViewById(R.id.button3);

        buttonObject1.setText("Contacts");
        buttonObject2.setText("Email");
        buttonObject3.setText("Messages");

        buttonObject1.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);

        buttonObject1.setBackgroundColor(0xff00ffff);
        buttonObject2.setBackgroundColor(0xffff00ff);
        buttonObject3.setBackgroundColor(0xff00ff00);

    }//end of onCreate( )

    public void onClick (View view)
    {
        if(view.getId()== R.id.button1)
        {
            Toast.makeText(this, "You selected contacts!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected contacts!");
        }
        else if (view.getId()== R.id.button2)
        {
            Toast.makeText(this, "You selected email!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected email!");
        }
        else
        {
            Toast.makeText(this, "You selected messages!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected messages!");
        }

    }

}//end of class
