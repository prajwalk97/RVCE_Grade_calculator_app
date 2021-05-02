package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cie,see;
    private Button grade;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cie = findViewById(R.id.CIE);
        see = findViewById(R.id.SEE);
        grade = findViewById(R.id.grade);
        result = findViewById(R.id.Result);
    }
    public void setGrade(View view)
    {
        String cieScore = cie.getText().toString();
        int cies= Integer.parseInt(cieScore);
        String seeScore = see.getText().toString();
        int sees = Integer.parseInt(seeScore);
        int total=(cies+sees)/2;
        if(total>=90) {
            result.setText("S GRADE!");
        }
        else if(total>=80)
            result.setText("A GRADE");
        else if(total>=70)
            result.setText("B GRADE");
        else if(total>=60)
            result.setText("C GRADE");
        else if(total>=50)
            result.setText("D GRADE");
        else if(total>=40)
            result.setText("E GRADE");
        else if (total<40)
            result.setText("F GRADE :");
        }


    }


