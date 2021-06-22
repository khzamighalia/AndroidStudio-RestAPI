package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

//model de la liste des users

public class GitUsersResponse {
    @SerializedName("total_count")
    public int totalCount;
    @SerializedName("items")
    public List<GitUser> users=new ArrayList<>();
}
