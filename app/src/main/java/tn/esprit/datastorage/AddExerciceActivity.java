package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import tn.esprit.datastorage.database.MyDatabase;
import tn.esprit.datastorage.entity.Exercice;

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

        MyDatabase db = MyDatabase.getDatabase(AddExerciceActivity.this);

        addExercicebtn =  findViewById(R.id.addExercicebtn);
        exerciceName = findViewById(R.id.exerciceName);
        exercice_category = findViewById(R.id.exercice_category);
        exerciceDetails = findViewById(R.id.exerciceDetails);
        exercicePic = findViewById(R.id.exercicePic);


        exercicePic.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

                System.out.println();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                System.out.println("Nothing selected yet");
            }
        });

        addExercicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Exercice exercice = new Exercice();
                exercice.setCategory(exercice_category.getText().toString());
                exercice.setName((exerciceName.getText().toString()));
                exercice.setDescription(exerciceDetails.getText().toString());

                switch (exercicePic.getSelectedItem().toString()){
                    case "Deadlift":
                        exercice.setPicture(R.drawable.deadlift);
                        break;
                    case "Biceps":
                        exercice.setPicture(R.drawable.biceps);
                        break;
                    case "Squat":
                        exercice.setPicture(R.drawable.squat);
                        break;
                    case "Triceps":
                        exercice.setPicture(R.drawable.triceps);
                }

                db.ExerciceDAO().insertExercice(exercice);
                Toast.makeText(AddExerciceActivity.this,"Operation Done successfully",Toast.LENGTH_SHORT).show();
                exerciceName.setText("");
                exercice_category.setText("");
                exerciceDetails.setText("");
            }
        });

    }
}