package tn.esprit.datastorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminActivity extends AppCompatActivity {

    Button addExercice;
    Button addRecepie;
    ImageView adminLogout;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.gymicon);

        addExercice = findViewById(R.id.addExercice);
        addRecepie = findViewById(R.id.addRecepie);
        adminLogout = findViewById(R.id.adminLogout);


        addExercice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AdminActivity.this, AddExerciceActivity.class);
                startActivity(intent);
                //System.out.println("ADD exercice Button clicked successfully ! ");
            }
        });
    }
}