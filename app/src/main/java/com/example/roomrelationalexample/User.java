package com.example.roomrelationalexample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "_user")
public class User {
    @PrimaryKey
    @ColumnInfo(name = "user_id")
    int userId;
    @NonNull
    @ColumnInfo(name = "user_name")
    String userName;

    public User(int userId, @NonNull String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @NonNull
    public String getUserName() {
        return userName;
    }

    public void setUserName(@NonNull String userName) {
        this.userName = userName;
    }
}
