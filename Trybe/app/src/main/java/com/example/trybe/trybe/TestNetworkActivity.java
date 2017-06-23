package com.example.trybe.trybe;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//public class TestNetworkActivity extends AppCompatActivity {
public class TestNetworkActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_network);
    }

    //Switch screens
    public void switchScreen(View view){
        Intent switchScreenIntent = new Intent(this, MainActivity.class);
        //final int result = 1;
        //intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(switchScreenIntent);
        finish();
    }
}
