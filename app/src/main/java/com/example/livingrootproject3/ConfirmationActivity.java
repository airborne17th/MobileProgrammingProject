package com.example.livingrootproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        TextView result = (TextView)findViewById(R.id.txtResult);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int players = sharedPref.getInt("key1", 0);
        String time = sharedPref.getString("key2", null);
        result.setText("Your reservation is " + time + " \n with this number of players: " + players);
    }
    public void backHome(View view) {
        Intent intent = new Intent(ConfirmationActivity.this, MainActivity.class);
        startActivity(intent);
    }
}