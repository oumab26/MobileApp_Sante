package tn.esprit.datastorage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import tn.esprit.datastorage.database.MyDatabase;
import tn.esprit.datastorage.entity.Calorie;

public class CalorieActivity extends AppCompatActivity {


    EditText taille;
    EditText poid;
    Button add;
    //Button logout;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);

        SharedPreferences sp = getSharedPreferences("sp", MODE_PRIVATE);

        taille = findViewById(R.id.taille);
        poid = findViewById(R.id.poid);
        add = findViewById(R.id.add);
        result = findViewById(R.id.result);
        //logout = findViewById(R.id.logout);
        MyDatabase db = MyDatabase.getDatabase(CalorieActivity.this);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double T = Double.parseDouble(taille.getText().toString());
                double P = Double.parseDouble(poid.getText().toString());


                double  c =P/(T*T);
                String res= "";
                if(c >=40){
                    res="obésité morbide ou massive";
                }else if(c <40 && c >=35){
                    res="obésité sévére";
                }else if(c <35 && c >=30){
                    res="obésité modérée";
                }else if(c <33  && c >=25){
                    res ="surpoids";
                }else if(c <25 && c >=18.5){
                    res ="corpulence normale";
                }else if(c <18.5 && c >=16.5){
                    res ="maigreur";
                }
                else{
                    res ="famine";
                }
                result.setText(res);
            }


        });
       // logout.setOnClickListener(v -> {
       //     sp.edit().clear().apply();
       //     finish();
       // });


    }
}
