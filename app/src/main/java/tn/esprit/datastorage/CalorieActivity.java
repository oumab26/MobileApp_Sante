package tn.esprit.datastorage;

import android.content.SharedPreferences;
import android.os.Bundle;
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
    Button logout;
    TextView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);

        SharedPreferences sp = getSharedPreferences("sp", MODE_PRIVATE);
        setTitle("Hello " + sp.getString("username", "Skander"));
        taille = findViewById(R.id.taille);
        poid = findViewById(R.id.poid);
        add = findViewById(R.id.add);
        list = findViewById(R.id.calorie);
        logout = findViewById(R.id.logout);
        MyDatabase db = MyDatabase.getDatabase(CalorieActivity.this);
        add.setOnClickListener(v -> {

            float Taille = Float.parseFloat(taille.getText().toString());
            float Poid = Float.parseFloat(poid.getText().toString());
            Calorie a = new Calorie(Taille, Poid);

            db.CalorieDAO().insertCalorie(a);

            List<Calorie> articleList = db.CalorieDAO().findCalorie();

            list.setText(articleList.toString());
        });

        logout.setOnClickListener(v -> {
            sp.edit().clear().apply();
            finish();
        });


    }
}
