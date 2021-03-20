package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ahXWnRfUakJMi8wrfAb6oZHnxfbQBkf2YDBRKDwf")
                .clientKey("JhjYfJOhDClAd20EwiqNJdYM8Fqqx5VJZUwwVnJ2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
