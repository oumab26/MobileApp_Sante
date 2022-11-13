package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.text.DecimalFormat;
public class BmiActivity extends AppCompatActivity {



    Button calculateBmi;
    TextView result;
    RadioButton man;
    RadioButton women;
    EditText weight;
    EditText height;
    EditText age;


    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.gymicon);
        calculateBmi = findViewById(R.id.btnCalculateBmi);
        result = findViewById(R.id.texteres);
        women = findViewById(R.id.btnWomen);
        man = findViewById(R.id.btnman);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        age = findViewById(R.id.age);


        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(man.isChecked()){
                    women.setChecked(false);
                }

            }
        });

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(women.isChecked()){
                    man.setChecked(false);
                }

            }
        });

        calculateBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res = 0;
                DecimalFormat df = new DecimalFormat("0.00");


                System.out.println(man.isChecked());
                if(man.isChecked()){
                    res = 66.47 + (13.75 * Double.parseDouble(weight.getText().toString())) + (5.003 * Double.parseDouble(height.getText().toString())) - (6.755 * Integer.parseInt(age.getText().toString()));
                }
                if(women.isChecked()){
                    res = 655.1 + (9.563 * Double.parseDouble(weight.getText().toString())) + (1.850 * Double.parseDouble(height.getText().toString())) - (4.676 * Integer.parseInt(age.getText().toString()));
                }
                if(res>0){
                    result.setText(df.format(res) + " Calories");
                }

                else{
                    result.setText("");
                }



                /*
                For women, BMR = 655.1 + (9.563 x weight in kg) + (1.850 x height in cm) - (4.676 x age in years)
For men, BMR = 66.47 + (13.75 x weight in kg) + (5.003 x height in cm) - (6.755 x age in years)
                */

            }
        });



    }
}