package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {



    Button calculateBmi;
    TextView result;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        calculateBmi = findViewById(R.id.btnCalculateBmi);
        result = findViewById(R.id.texteres);

        calculateBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(10-10 + "you have to");

            }
        });



    }
}