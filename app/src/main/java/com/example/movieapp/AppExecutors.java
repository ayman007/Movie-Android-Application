package com.example.movieapp;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

//Executor for Background Tasks
public class AppExecutors {

    private static AppExecutors instance;

    public static AppExecutors getInstance(){
        if (instance == null){
            instance=new AppExecutors();
        }
        return instance;
    }

    private final ScheduledExecutorService mNetworkIO= Executors.newScheduledThreadPool(3);

    public ScheduledExecutorService networkIO(){
        return mNetworkIO;
    }
}
