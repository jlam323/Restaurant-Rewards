package com.example.trybe.trybe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Send button to make pop-up
    public void sendMessage(View view) {
        Toast myToast = Toast.makeText(
                getApplicationContext(), "Pop-up!",
                Toast.LENGTH_LONG);
        myToast.show();
    }

    //Switch screens
    public void switchScreen(View view){
        Intent switchScreenIntent = new Intent(this, TestNetworkActivity.class);
        //final int result = 1;
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(switchScreenIntent);
    }
}
