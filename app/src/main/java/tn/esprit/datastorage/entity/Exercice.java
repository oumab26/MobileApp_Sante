package tn.esprit.datastorage.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class Exercice {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private String name;
    @ColumnInfo
    private String category;
    @ColumnInfo
    private String Description;
    @ColumnInfo
    private int picture;


    public Exercice(){

    }

    public Exercice(String name, String category, String description, int picture) {
        this.name = name;
        this.category = category;
        Description = description;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int pictures) {
        this.picture = pictures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
