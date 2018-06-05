package com.example.palmdigital.simplecalcv02;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    int result;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display=findViewById(R.id.tvNum1Display);
        textViewNum2Display=findViewById(R.id.tvNum2Display);
        textViewOutput=findViewById(R.id.tv_output);

        ImageView imageView1 = findViewById(R.id.imageNum1);
        ImageView imageView2 = findViewById(R.id.imageNum2);
        ImageView imageView3 = findViewById(R.id.imageNum3);
        ImageView imageView4 = findViewById(R.id.imageNum4);
        ImageView imageView5 = findViewById(R.id.imageNum5);
        ImageView imageView6 = findViewById(R.id.imageNum6);
        ImageView imageView7 = findViewById(R.id.imageViewEquals);
        ImageView imageView8 = findViewById(R.id.imageMinusSign);
        ImageView imageView9 = findViewById(R.id.imageViewPlusSign);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId()==R.id.imageNum1)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if (v.getId()==R.id.imageNum2)
        {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if (v.getId()==R.id.imageNum3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if (v.getId()==R.id.imageNum4)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if (v.getId()==R.id.imageNum5)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if (v.getId()==R.id.imageNum6)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if (v.getId()==R.id.imageViewPlusSign)
        {
            operation = '+';
        }
        else if (v.getId()==R.id.imageMinusSign)
        {
            operation = '-';
        }

        else if (v.getId() == R.id.imageViewEquals)
        {
            if (operation == '+')
            {
                result = num1 + num2;
            }
            else
            {
                result = num1 - num2;
            }
            textViewOutput.setText("" + result);
        }



    }

}//end of class

