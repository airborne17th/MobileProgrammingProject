package com.example.livingrootproject3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void GoTo_MapActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);
    }

    public void GoTo_ReachActivity(View view) {
        Intent intent = new Intent(MainActivity.this, ReachActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showFaction(View view) {
        switch (view.getId()) {
            case (R.id.cat):
                displayToast(getString(R.string.faction_cat_message));
                break;
            case (R.id.bird):
                displayToast(getString(R.string.faction_bird_message));
                break;
            case (R.id.woodland):
                displayToast(getString(R.string.faction_woodland_message));
                break;
            case (R.id.vagabond):
                displayToast(getString(R.string.faction_vagabond_message));
                break;
            case (R.id.lizard):
                displayToast(getString(R.string.faction_lizard_message));
                break;
            case (R.id.riverfolk):
                displayToast(getString(R.string.faction_riverfolk_message));
                break;
            case (R.id.duchy):
                displayToast(getString(R.string.faction_duchy_message));
                break;
            case (R.id.corvid):
                displayToast(getString(R.string.faction_corvid_message));
                break;
        }
    }

    public void askFavorite(View view) {
        displayToast(getString(R.string.question_favorite_message));
    }
}