package com.example.palmdigital.ceasarcipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonEncypt = findViewById(R.id.buttonEncrypt);
        Button buttonDecrypt = findViewById(R.id.buttonDecrypt);
        buttonEncypt.setOnClickListener(this);
        buttonDecrypt.setOnClickListener(this);
        }
    public void onClick(View view)
    {
        EditText et_message = findViewById(R.id.message);
        EditText et_shift   = findViewById(R.id.shift);
        String messagestr   = et_message.getText().toString();
        String strShift     = et_shift.getText().toString();
        int shift           = Integer.parseInt(strShift);

        if(view.getId() == R.id.buttonEncrypt)
        {
            TextView output1 = findViewById(R.id.tv_output1);
            String encrypted = encrypt(messagestr, shift);
            output1.setText(encrypted);

        }
        else if(view.getId()==R.id.buttonDecrypt)
        {
            TextView output2 = findViewById(R.id.tv_output2);
            String decrypted = decrypt(messagestr,shift);
            output2.setText(decrypted);
        }

    }

    public static String encrypt(String input, int shift) {
        String outputStr = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        for (int i = 0; i < input.length(); i++)
        {
            char thisChar = input.charAt(i);
            if (thisChar == ' ')
            {
                outputStr += ' ';
            }
            else // thisChar is not a space character
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (thisChar == alphabet[j])
                    {
                        int shiftIndex = (j + shift) % alphabetSize;
                        outputStr += alphabet[shiftIndex];
                    }
                }
            }
        }
        return outputStr; // should be return output
    }
    public static String decrypt (String input, int shift) {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';

        for (int i = 0; i < input.length(); i++)
        {
            char thisChar = input.charAt(i);
            if (thisChar == ' ')
            {
                output += input.charAt(i);
            }
            else
            {

                for (int j = 0; j < alphabetSize; j++)
                {
                    if (thisChar == alphabet[j])
                    {
                        int shiftIndex = (j - shift + 26) % alphabetSize;
                        output += alphabet[shiftIndex];
                    }
                }
            }
        }
        return "this is decrypt broken"; // thie should return output
    }
}