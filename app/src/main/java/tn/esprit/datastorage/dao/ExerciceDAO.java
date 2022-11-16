package tn.esprit.datastorage.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.datastorage.entity.Exercice;

@Dao
public interface ExerciceDAO {

    @Insert
    public void insertExercice(Exercice exercice);

    @Update
    public void updateExercice(Exercice exercice);

    @Delete
    public void deleteExercice(Exercice exercice);

    @Query("SELECT * FROM Exercice")
    public List<Exercice> findExercices();

    @Query("SELECT * FROM Exercice WHERE Exercice.name == :name")
    public Exercice get(String name);
}
