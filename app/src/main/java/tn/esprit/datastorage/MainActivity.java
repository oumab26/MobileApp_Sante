package tn.esprit.datastorage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences("sp", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        if (sp.getString("username", "").equals("")) {
            usernameET = findViewById(R.id.username);
            passwordET = findViewById(R.id.password);
            signin = findViewById(R.id.signin);

            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editor.putString("username", usernameET.getText().toString()).apply();
                    editor.putString("pass", passwordET.getText().toString()).apply();

                    navigate();
                }
            });
        } else {
            navigate();
        }
    }

    private void navigate() {
        Intent i = new Intent(MainActivity.this, CalorieActivity.class);
        startActivity(i);
    }
}