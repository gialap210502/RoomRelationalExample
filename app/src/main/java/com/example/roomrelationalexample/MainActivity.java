package com.example.roomrelationalexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Hike_Database db;
    AllDao allDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Build the MyDatabase instance
        db = Room.databaseBuilder(this,Hike_Database.class,"HikeDB")
                .allowMainThreadQueries()
                .build();
        // Build the allDao instance
        allDao = db.allDao();

        // Create some school objects
        User[] u_array = {new User(1, "Lap"),
                new User(2, "Cuong"),
                new User(3, "Loi")
        };
        // Insert the Schools into the database
        for (User u: u_array) {
            allDao.addUser(u);
        }
        // Create some Student Objects
        Review[] r_array = {
                new Review(1,"3","oke", 1), new Review(2,"1","hello", 3)
        };
        //Insert the Students
        for(Review r: r_array) {
            allDao.addReview(r);
        }
    }
}