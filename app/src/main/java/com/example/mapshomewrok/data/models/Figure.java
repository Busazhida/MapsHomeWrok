package com.example.mapshomewrok.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Figure {

    double latitude;

    double latlng;

    public Figure(double latitude, double latlng) {
        this.latitude = latitude;
        this.latlng = latlng;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLatlng() {
        return latlng;
    }

    public void setLatlng(double latlng) {
        this.latlng = latlng;
    }

    @PrimaryKey(autoGenerate = true)
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
