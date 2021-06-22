package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

//model des user

public class GitUser {
    public int id;
    public String login;
    //pour insert le nom comme il est dans json
    @SerializedName("avatar_url")
    public  String avatarUrl;
    public int score;
}
