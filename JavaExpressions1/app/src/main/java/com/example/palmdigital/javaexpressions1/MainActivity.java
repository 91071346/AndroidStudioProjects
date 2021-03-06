package com.example.palmdigital.javaexpressions1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 10;
        String b = "Allan Turing";
        boolean c = true;

        Log.i("info", "Hello, Android");
        Log.i("info", "a = " + a);
        Log.i("info", "b = " + b);
        Log.i("info", "c = " + c);
        a++;
        Log.i("info", "a = " + a);
        Log.i("info", "c =" + (1 + 1 == 3));

        float myFloat = 4.0f;
        double myDouble = 42.0;
        int result = myAwesomeFunction();
        Log.i("info", "myAwesomeFunction returned = " + result);
        Log.i("info", "myFloat function returned = " + myFloatReturner());

        //Challenge: make a function that returns void that logs something out to
        //                                the Logcat

        myFunction2();

}//end of onCreate method

    int myAwesomeFunction()
    {
return 1000;
    }


    //return a float
    float myFloatReturner()
    {
        return 100.0f;
    }


    void myFunction2()
    {
        Log.i("info", "Hello from myFunction2!");
    }

}//end of class MainActivity
