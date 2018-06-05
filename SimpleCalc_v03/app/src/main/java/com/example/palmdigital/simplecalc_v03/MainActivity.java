package com.example.palmdigital.simplecalc_v03;

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
    double result;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.tv_output);

        ImageView imageView1 = findViewById(R.id.imageViewNum0);
        ImageView imageView2 = findViewById(R.id.imageViewNum1);
        ImageView imageView3 = findViewById(R.id.imageViewNum2);
        ImageView imageView4 = findViewById(R.id.imageViewNum3);
        ImageView imageView5 = findViewById(R.id.imageViewNum4);
        ImageView imageView6 = findViewById(R.id.imageViewNum5);
        ImageView imageView7 = findViewById(R.id.imageViewNum6);
        ImageView imageView8 = findViewById(R.id.imageViewNum7);
        ImageView imageView9 = findViewById(R.id.imageViewNum8);
        ImageView imageView10 = findViewById(R.id.imageViewNum9);
        ImageView imageView11 = findViewById(R.id.imageViewPlusSign);
        ImageView imageView12 = findViewById(R.id.imageViewMinusSign);
        ImageView imageView13 = findViewById(R.id.imageViewDivisionSign);
        ImageView imageView14 = findViewById(R.id.imageViewMultiplySign);
        ImageView imageView15 = findViewById(R.id.imageViewExponentSign);
        ImageView imageView16 = findViewById(R.id.imageNum0);
        ImageView imageView17 = findViewById(R.id.imageNum1);
        ImageView imageView18 = findViewById(R.id.imageNum2);
        ImageView imageView19 = findViewById(R.id.imageNum3);
        ImageView imageView20 = findViewById(R.id.imageNum4);
        ImageView imageView21 = findViewById(R.id.imageNum5);
        ImageView imageView22 = findViewById(R.id.imageNum6);
        ImageView imageView23 = findViewById(R.id.imageNum7);
        ImageView imageView24 = findViewById(R.id.imageNum8);
        ImageView imageView25 = findViewById(R.id.imageNum9);
        ImageView imageView26 = findViewById(R.id.imageViewEquals);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageView10.setOnClickListener(this);
        imageView11.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
        imageView17.setOnClickListener(this);
        imageView18.setOnClickListener(this);
        imageView19.setOnClickListener(this);
        imageView20.setOnClickListener(this);
        imageView21.setOnClickListener(this);
        imageView22.setOnClickListener(this);
        imageView23.setOnClickListener(this);
        imageView24.setOnClickListener(this);
        imageView25.setOnClickListener(this);
        imageView26.setOnClickListener(this);
    }
        public void onClick (View v)
        {
            if (v.getId()==R.id.imageViewNum0)
            {
                textViewNum1Display.setText("0");
                num1 = 0;
            }
            else if (v.getId()==R.id.imageViewNum1)
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
                textViewNum1Display.setText("4");
                num1 = 4;
            }
            else if (v.getId()==R.id.imageViewNum5)
            {
                textViewNum1Display.setText("5");
                num1 = 5;
            }
            else if (v.getId()==R.id.imageViewNum6)
            {
                textViewNum1Display.setText("6");
                num1 = 6;
            }
            else if (v.getId()==R.id.imageViewNum7)
            {
                textViewNum1Display.setText("7");
                num1 = 7;
            }
            else if (v.getId()==R.id.imageViewNum8)
            {
                textViewNum1Display.setText("8");
                num1 = 8;
            }
            else if (v.getId()==R.id.imageViewNum9)
            {
                textViewNum1Display.setText("9");
                num1 = 9;
            }
            else if (v.getId()==R.id.imageNum0)
            {
                textViewNum2Display.setText("0");
                num2 = 0;
            }
            else if (v.getId()==R.id.imageNum1)
            {
                textViewNum2Display.setText("1");
                num2 = 1;
            }
            else if (v.getId()==R.id.imageNum2)
            {
                textViewNum2Display.setText("2");
                num2 = 2;
            }
            else if (v.getId()==R.id.imageNum3)
            {
                textViewNum2Display.setText("3");
                num2 = 3;
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
            else if (v.getId()==R.id.imageNum7)
            {
                textViewNum2Display.setText("7");
                num2 = 7;
            }
            else if (v.getId()==R.id.imageNum8)
            {
                textViewNum2Display.setText("8");
                num2 = 8;
            }
            else if (v.getId()==R.id.imageNum9)
            {
                textViewNum2Display.setText("9");
                num2 = 9;
            }
            else if (v.getId()==R.id.imageViewPlusSign)
            {
                operation = '+';
            }
            else if (v.getId()==R.id.imageViewMinusSign)
            {
                operation = '-';
            }
            else if (v.getId()==R.id.imageViewMultiplySign)
            {
                operation = '*';
            }
            else if(v.getId()==R.id.imageViewDivisionSign)
            {
                operation = '/';
            }
            else if (v.getId()==R.id.imageViewExponentSign)
            {
                operation = '^';
            }
            else if (v.getId()==R.id.imageViewEquals)
            {
                if (operation == '+')
                {
                    result = num1 + num2;
                }
                else if (operation == '-')
                {
                    result = num1 - num2;
                }
                else if (operation == '*')
                {
                    result = num1 * num2;
                }
                else if (operation == '/')
                {
                    result = (double)num1 / num2;
                }
                else
                {
                    result = pow(num1, num2);
                }
                textViewOutput.setText("" + result);
            }
        }

//    public static void main(String[] args)
//    {
//        int base = 3;
//        int exponent = 3;
//        int result = pow(base, exponent);
//        System.out.println("the answer is: " + result);
//    }


    public static int pow(int num1, int num2)
    {
        int product = 1;
        int base = num1;
        int exp = num2;
        for (int i = 0; i < exp; i++)
        {
            product = product * base;
        }
        return product;
    }

} //end of class