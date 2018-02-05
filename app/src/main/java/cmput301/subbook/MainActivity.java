package cmput301.subbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;

import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * CustomerAdapter
 * Version 1.0
 * Copyright © 2018 CMPUT301, University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and conditions of the code of Student Behaviour.
 * at University of Alberta.
 * @name: Shardul Shah
 * You can find a copy of the license in this project. Otherwise please contact shardul@ualberta.ca*
 * @date:  2/4/2018
 */


public class MainActivity extends AppCompatActivity {

    private TextView text;
    private List<String> subListVal;

    /*This class is the mainactivity. It is supposed to implement the main activity and structure
    /of the application. However, after versioning and testing the code out, my app which had
    the required specs of the assignment stopped working and crashed consistently for unknown reasons;
    after reverting to the old version, I had to go back to the static version of the app I made
    for testing as my dynamic version did not work.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.mainText);

        //subListVal is supposed to be the arrayList which contains all the subscriptions and its information

        final ArrayList<String> subListVal = new ArrayList<String>();

        subListVal.add("Netflix");
        subListVal.add("Github");
        subListVal.add("Spotify");
        subListVal.add("Gym");

        final CustomAdapter adapter = new CustomAdapter(subListVal, this);

        //handle listview and assign adapter
        ListView lView = (ListView) findViewById(R.id.listView);
        lView.setAdapter(adapter);

        //button: when pressed, a new subscription is added. This is static/hard coded as of now.
        Button add_btn = new Button(this);
        add_btn.setText("Add New");
        lView.addFooterView(add_btn);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subListVal.add("Input Item");
                adapter.notifyDataSetChanged();
                //updating adapter
            }
        });

    }

    }



