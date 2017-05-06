package com.example.chesmara.workshop1;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


public class WorkshopAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
