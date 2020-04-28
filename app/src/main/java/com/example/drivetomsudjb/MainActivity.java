package com.example.drivetomsudjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //hide the support bar that displays the app title
        getSupportActionBar().hide();
    }
    //method used by the button to open google maps
    public void startMaps(View view){
        //creating object to hold the destination information and pass it to google maps
        Uri gmmIntentUri = Uri.parse("google.navigation:q=1+Normal+Ave,+Montclair+New+Jersey&mode=d&avoid=f");
        //assigning the URI object to a intent
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        //telling the intent to change to google maps
        mapIntent.setPackage("com.google.android.apps.maps");
        //starting google maps
        startActivity(mapIntent);
    }
}
