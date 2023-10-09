package com.example.roomrelationalexample;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class ReviewWithUser {
    @Embedded
    Review review;

    @Relation(entity = User.class,parentColumn = "user_id", entityColumn = "user_id")
    List<User> userList;
}
