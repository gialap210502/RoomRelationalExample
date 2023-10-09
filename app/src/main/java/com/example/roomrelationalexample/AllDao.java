package com.example.roomrelationalexample;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AllDao {
    @Insert
    long addUser(User u);
    @Insert
    long addReview(Review r);
    @Query("SELECT * FROM _user")
    List<User> getAllSchools();
    @Query("SELECT * FROM _user WHERE user_id = :user_id ")
    User getSchoolById(int user_id);
    @Query("SELECT * FROM _review")
    List<ReviewWithUser> getReviewWithUser();
}
