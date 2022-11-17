package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ExerciceDetailsActivity extends AppCompatActivity {

    TextView description;
    TextView exercicename;
    ImageView image;

    @SuppressLint({"RestrictedApi", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_details);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.gymicon);

        description = findViewById(R.id.description);
        exercicename = findViewById(R.id.exercicename);
        image = findViewById(R.id.exerciceimage);

        String exerciceName = getIntent().getStringExtra("name");
        String exerciceDescription = getIntent().getStringExtra("description");
        int exerciceImage = getIntent().getIntExtra("image",0);

        description.setText(exerciceDescription);
        exercicename.setText(exerciceName);
        image.setBackgroundResource(exerciceImage);




    }
}