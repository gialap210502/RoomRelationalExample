package com.example.roomrelationalexample;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class, Review.class}, version = 1)
public abstract class Hike_Database extends RoomDatabase {
    private static final String Database_name = "Hike_v1.db";
    private static Hike_Database instance;

    public static synchronized Hike_Database getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),Hike_Database.class,Database_name)
                    .allowMainThreadQueries()
                    .build();
        };
        return instance;
    }
    public abstract  AllDao allDao();
}
