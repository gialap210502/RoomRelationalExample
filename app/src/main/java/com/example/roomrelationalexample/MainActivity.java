package com.example.roomrelationalexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Build the MyDatabase instance
//        db = Room.databaseBuilder(this,Hike_Database.class,"HikeDB")
//                .allowMainThreadQueries()
//                .build();
        // Build the allDao instance
//        allDao = db.allDao();

        // Create some school objects
        User[] u_array = {new User(99, "Lap"),
                new User(15, "Cuong"),
                new User(20, "Loi")
        };
        // Insert the Schools into the database
        for (User u: u_array) {
            Hike_Database.getInstance(this).allDao().addUser(u);
        }
        // Create some Student Objects
        Review[] r_array = {
                new Review(516,"3","oke", 15), new Review(710,"1","hello", 3)
        };
        //Insert the Students
        for(Review r: r_array) {
            Hike_Database.getInstance(this).allDao().addReview(r);
        }
    }
}