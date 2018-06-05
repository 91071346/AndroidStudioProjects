package com.example.palmdigital.madlibs_puppy_v01;

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

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        EditText et_color    = findViewById(R.id.et_Color);
        String colorstr      = et_color.getText().toString();

        EditText et_bodypart = findViewById(R.id.et_BodyPart);
        String bodypartstr   = et_bodypart.getText().toString();

        EditText et_noun1    = findViewById(R.id.et_Noun1);
        String noun1str      = et_noun1.getText().toString();

        EditText et_verb1    = findViewById(R.id.et_Verb1);
        String verb1str      = et_verb1.getText().toString();

        EditText et_adj1     = findViewById(R.id.et_Adjective1);
        String adj1str    = et_adj1.getText().toString();

        EditText et_adj2     = findViewById(R.id.et_Adjective2);
        String adj2str       = et_adj2.getText().toString();

        EditText et_verb2    = findViewById(R.id.et_Verb2);
        String verb2str      = et_verb2.getText().toString();

        EditText et_noun2    = findViewById(R.id.et_Noun2);
        String noun2str      = et_noun2.getText().toString();

        EditText et_noun3    = findViewById(R.id.et_Noun3);
        String noun3str      = et_noun3.getText().toString();

        TextView story = findViewById(R.id.story);
        String storyStr = story.getText().toString();
        story.setText("Today I saw him again. When he looks at me with those " + colorstr + " eyes, it makes my "
                + bodypartstr + " go pitterpat, and I feel as if I have " + noun1str + " in my stomach. When he scrunches his nose, I want to "
                + verb1str + " him softly. He is so " + adj1str + " and " + adj2str + ". Tomorrow he will be mine. For now he " + verb2str +
                " in the store " + noun2str + " looking at me. " + noun3str + " love is hard to resist!");

    }
}
