package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    public enum Gender {M, F}
    private final int userID;
    private final String username;
    private final Gender gender;
    private final LocalDate birthDate;
    private final int numberOfPublishedPost;

    public ForumUser(final int userID, final String username, final Gender gender,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int numberOfPublishedPost) {

        this.userID = userID;
        this.username = username;
        this.gender = gender;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPublishedPost = numberOfPublishedPost;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPublishedPost() {
        return numberOfPublishedPost;
    }

    @Override
    public String toString() {
        return "ForumUser {" +
                "userID = " + userID +
                ", username = '" + username + '\'' +
                ", gender = " + gender +
                ", birthDate = " + birthDate +
                ", numberOfPublishedPost = " + numberOfPublishedPost +
                '}';
    }
}
