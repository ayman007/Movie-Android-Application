package com.example.movieapp.response;

import com.example.movieapp.models.MovieModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//This class is for single movie request
public class MovieResponse {

    //1- Finding the movie Object
    @SerializedName("results")
    @Expose
    private MovieModel movie;

    public MovieModel getMovieModel(){
        return movie;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movie=" + movie +
                '}';
    }
}
