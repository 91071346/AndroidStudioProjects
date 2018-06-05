package com.example.palmdigital.a02_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Hello Android Developers",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"Account Created!",
                Toast.LENGTH_SHORT).show();
        
    }
}
