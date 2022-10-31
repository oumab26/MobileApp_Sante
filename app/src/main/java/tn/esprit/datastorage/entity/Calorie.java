package tn.esprit.datastorage.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Calorie {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo
    private double taille;
    @ColumnInfo
    private double poid;

    public Calorie() {
    }

    public Calorie(int id, double taille, double poid) {
        this.id = id;
        this.taille = taille;
        this.poid = poid;
    }

    public Calorie(double taille, double poid) {
        this.taille = taille;
        this.poid = poid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(float taille) {
        this.taille = taille;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(float poid) {
        this.poid = poid;
    }

    @Override
    public String toString() {
        return "Calorie{" +
                "id=" + id +
                ", taille='" + taille + '\'' +
                ", poid=" + poid +
                '}';
    }
}
