package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {


    Button calculateCalories;
    Button bmiActivity;
    Button btnGym;
    Button btnchrono;


    //SharedPreferences sp = getSharedPreferences("sp", MODE_PRIVATE);



    Button logout;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.gymicon);
        calculateCalories = findViewById(R.id.btnCalorie);
        bmiActivity = findViewById(R.id.btnBmi);
        btnGym = findViewById(R.id.btnGym);
        btnchrono = findViewById(R.id.btnchrono);
        logout = findViewById(R.id.btnLogout);

        calculateCalories.setBackgroundColor(0x000);
        calculateCalories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuActivity.this, CalorieActivity.class);
                startActivity(intent);
            }
        });
        bmiActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuActivity.this, BmiActivity.class);
                startActivity(intent);
            }
        });

        btnGym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuActivity.this, ExerciceActivity.class);
                startActivity(intent);
            }
        });

        btnchrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MenuActivity.this, ChronoActivity.class);
                startActivity(intent);
            }
        });


        logout.setOnClickListener(v -> {
            // sp.edit().clear().apply();
             finish();
         });


    }
}