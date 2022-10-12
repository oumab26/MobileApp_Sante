package tn.esprit.datastorage.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tn.esprit.datastorage.entity.Calorie;

@Dao
public interface CalorieDAO {

    @Insert
    public void insertCalorie(Calorie a);

    @Update
    public void updateCalorie(Calorie a);

    @Delete
    public void deleteCalorie(Calorie a);

    @Query("SELECT * FROM Calorie")
    public List<Calorie> findCalorie();
}
