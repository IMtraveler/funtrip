package com.example.user.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocationListActivity extends AppCompatActivity {

    LocationsDatabase myDatabase;
    private ArrayList<Locations> locationArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_list);

        myDatabase = new LocationsDatabase(LocationListActivity.this);

        locationArrayList=myDatabase.getLocations();

        Log.e("poses list",locationArrayList.size()+"");

        for(int i=0;i<locationArrayList.size();i++){
            Log.e(" category filter",locationArrayList.get(i).name+"");
        }
        myDatabase.close();
    }
}
