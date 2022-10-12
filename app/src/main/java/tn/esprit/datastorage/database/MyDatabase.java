package tn.esprit.datastorage.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import tn.esprit.datastorage.dao.CalorieDAO;

import tn.esprit.datastorage.entity.Calorie;

@Database(entities = {Calorie.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    private static MyDatabase instance;

    public abstract CalorieDAO CalorieDAO();

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
