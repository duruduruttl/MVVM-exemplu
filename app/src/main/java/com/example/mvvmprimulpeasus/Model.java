package com.example.mvvmprimulpeasus;

import static com.example.mvvmprimulpeasus.MainActivity.TAG;

import android.util.Log;

public class Model {

    private String nume="";
    private String prenume="";

    public Model() {
 //       this.nume = nume;
 //       this.prenume = prenume;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
        Log.d(TAG, "numele este : "+nume);
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
        Log.d(TAG, "prenumele este : "+prenume);
    }
}
