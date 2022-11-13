package tn.esprit.datastorage;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tn.esprit.datastorage.database.MyDatabase;
import tn.esprit.datastorage.entity.Exercice;

public class ExerciceActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ExerciceAdapter adapter = new ExerciceAdapter(this);
        MyDatabase db = MyDatabase.getDatabase(ExerciceActivity.this);
        Exercice exercice1 = new Exercice("Deadlift","Deadlift is a mandatory exercice","back",R.drawable.th_15_);
       // Exercice exercice2 = new Exercice("push up","Deadlift is a mandatory exercice","back","path fr pics");
       // Exercice exercice3 = new Exercice("Hamer","Deadlift is a mandatory exercice","back","path fr pics");

        db.ExerciceDAO().insertExercice(exercice1);
       // db.ExerciceDAO().insertExercice(exercice2);
       // db.ExerciceDAO().insertExercice(exercice3);
        List<Exercice> exerciceList = db.ExerciceDAO().findExercices();

      for(Exercice e : exerciceList){
           adapter.addExercice(e);
       }
        /*for(Exercice e : exerciceList){
            db.ExerciceDAO().deleteExercice(e);
        }*/
        recyclerView = findViewById(R.id.articles);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));


    }
}
