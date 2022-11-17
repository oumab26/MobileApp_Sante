package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AddExerciceActivity extends AppCompatActivity {

    Button addExercicebtn;
    TextView exerciceName;
    TextView exercice_category;
    TextView exerciceDetails;
    Spinner exercicePic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exercice);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.gymicon);


       addExercicebtn =  findViewById(R.id.addExercicebtn);
       exerciceName = findViewById(R.id.exerciceName);
       exercice_category = findViewById(R.id.exercice_category);
       exerciceDetails = findViewById(R.id.exerciceDetails);
       exercicePic = findViewById(R.id.exercicePic);


    }
}