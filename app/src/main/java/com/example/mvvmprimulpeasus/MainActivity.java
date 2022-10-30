package com.example.mvvmprimulpeasus;

import androidx.appcompat.app.AppCompatActivity;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvmprimulpeasus.databinding.ActivityMainBinding;

/**
 *  Obiectul proiectului este studiu MVVM
 *  avem doua cinpuri editabile pentru nume si prenume
 *  un cinp text pentru afisare nume+prenume
 *  creem doua clase Model si MyViewModel
 *  Model memoreaza nume si prenume
 *  MyViewModel viewmodel interfata model view(activity_layout)
 *  utilizam clasa obsevabil pentru observarea modificarilor in view
 *  setari build.gradle  in android databindin.enable=true
 *  grandle propertier android.enableJetifier=true anti
 *  duble class error
 *
 *ytuu65u65u65u6
 **/




public class MainActivity extends AppCompatActivity {

    public static  String TAG="debug_me";
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyViewModel myViewModel=new MyViewModel();
        // setContentView(R.layout.activity_main);
    activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);

// asociere modelview
        activityMainBinding.setModel(myViewModel);
    }


}