package tn.esprit.datastorage.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import tn.esprit.datastorage.dao.CalorieDAO;

import tn.esprit.datastorage.dao.ExerciceDAO;
import tn.esprit.datastorage.entity.Calorie;
import tn.esprit.datastorage.entity.Exercice;

@Database(entities = {Calorie.class,Exercice.class}, version = 2, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    private static MyDatabase instance;

    public abstract CalorieDAO CalorieDAO();
    public abstract ExerciceDAO ExerciceDAO();

    public static MyDatabase getDatabase(Context ctx) {
        if (instance == null) {
            instance = Room.databaseBuilder(ctx.getApplicationContext(), MyDatabase.class, "db")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }



}
