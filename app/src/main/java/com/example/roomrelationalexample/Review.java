package com.example.roomrelationalexample;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
@Entity(
        tableName = "_review", foreignKeys = {
        @ForeignKey(
                entity = User.class,
                parentColumns = {"user_id"},
                childColumns = {"user_id"},
                onDelete = ForeignKey.CASCADE,
                onUpdate = ForeignKey.CASCADE
        )
}
)
public class Review {
    @PrimaryKey
    @ColumnInfo(name = "review_id")
    int ReviewId;
    @ColumnInfo(name = "review_rate")
    String reviewRate;
    @ColumnInfo(name = "review_content")
    String reviewContent;
    @ColumnInfo(name = "user_id", index = true)
    int userID;

    public Review() {
    }
    public Review(int reviewId, String reviewRate, String reviewContent, int userID) {
        ReviewId = reviewId;
        this.reviewRate = reviewRate;
        this.reviewContent = reviewContent;
        this.userID = userID;
    }

    public int getReviewId() {
        return ReviewId;
    }

    public void setReviewId(int reviewId) {
        ReviewId = reviewId;
    }

    public String getReviewRate() {
        return reviewRate;
    }

    public void setReviewRate(String reviewRate) {
        this.reviewRate = reviewRate;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
