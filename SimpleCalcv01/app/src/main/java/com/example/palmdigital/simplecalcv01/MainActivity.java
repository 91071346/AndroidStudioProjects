package com.example.palmdigital.simplecalcv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
//member variables (class wide variables)
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create a reference to the X<L UI elements
        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.tv_output);

        //create a reference to the ImageVIew XMl UI elements
        ImageView imageView1 = findViewById(R.id.imageViewNum1);
        ImageView imageView2 = findViewById(R.id.imageViewNum2);
        ImageView imageView3 = findViewById(R.id.imageViewNum3);
        ImageView imageView4 = findViewById(R.id.imageViewNum4);
        ImageView imageView5 = findViewById(R.id.imageViewNum5);
        ImageView imageView6 = findViewById(R.id.imageViewNum6);
        ImageView imageView7 = findViewById(R.id.image_equals);

        //setting image view objects to be clickable
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);

    }//end of onCreate

    public void onClick (View v)
    {
        if (v.getId()==R.id.imageViewNum1)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if (v.getId()==R.id.imageViewNum2)
        {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if (v.getId()==R.id.imageViewNum3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if (v.getId()==R.id.imageViewNum4)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if (v.getId()==R.id.imageViewNum5)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if (v.getId()==R.id.imageViewNum6)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if (v.getId()==R.id.image_equals)
        {
            sum = num1 + num2;
            textViewOutput.setText("" + sum);
        }


    }

}//end of class
