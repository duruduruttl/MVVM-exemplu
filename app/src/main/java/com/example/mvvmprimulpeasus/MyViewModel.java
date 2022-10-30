package com.example.mvvmprimulpeasus;

import static com.example.mvvmprimulpeasus.MainActivity.TAG;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class MyViewModel extends BaseObservable {

    public Model model;

    public MyViewModel() {
        model =new Model();
        Log.d(TAG, "am creat model");
    }

    @Bindable
    public String getNume(){
        return model.getNume();
    }
    public void setNume(String nume){
        model.setNume(nume);
        notifyPropertyChanged(BR.nume);

    }

    @Bindable
    public String getPrenume(){
        return model.getPrenume();
    }
    public void setPrenume(String prenume){
        model.setPrenume(prenume);
        notifyPropertyChanged(BR.prenume);

    }


}
