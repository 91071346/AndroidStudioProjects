package com.example.palmdigital.scope_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //
    int myInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare a local variable
        //dateType variableName; <-- this is a local variable declaration

        //some examples of primitive types and declarations
        int myInt = 100; //int is a Java primitive type
        myInt = 200;
        double myDouble; //double is a Java primitive type
        char mychar;
        float myFloat;
        boolean myBool;
        byte myByte;
        long myLong;
        //these are not primitive they are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        //asign values to these variables
        myString = "this ia an awesome string";
        myInt = 5;
        myInt = awesomeMethod(myInt);
        Log.i("info", "myInt " + myInt);
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false;

        TextView tv_Num1Display = findViewById(R.id.tv_top);
        TextView tv_Num2Display;

        ImageView iv_stuff;
        Button button;

        awesomeMethod2();

    }//end of onCreate

    public  int awesomeMethod (int input)
    {
        myInt = 10;
        return input + 5;
    }

    public void awesomeMethod2()
    {
        myInt = 42;
        System.out.println("myInt =" + 3.1459);
    }

}//end of MainActivity class
