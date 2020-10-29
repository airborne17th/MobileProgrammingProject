package com.example.livingrootproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MapActivity extends AppCompatActivity {
    int[] clearingArray = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
    int[] resetArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        reset(view);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        ImageView map_image = (ImageView) findViewById(R.id.map_image);
        switch (view.getId()) {
            case R.id.fall:
                if (checked)
                    displayToast(getString(R.string.fall_map));
                map_image.setImageResource(R.drawable.map_fall);
                break;
            case R.id.winter:
                if (checked)
                    displayToast(getString(R.string.winter_map));
                map_image.setImageResource(R.drawable.map_winter);
                break;
            case R.id.lake:
                if (checked)
                    displayToast(getString(R.string.lake_map));
                map_image.setImageResource(R.drawable.map_lake);
                break;
            case R.id.mountain:
                if (checked)
                    displayToast(getString(R.string.mountain_map));
                map_image.setImageResource(R.drawable.map_mountain);
                break;
            default:
                // Do nothing.
                break;
        }
    }

    public void randomize(View view) {

        Random rand = new Random();

        for (int i = 0; i < clearingArray.length; i++) {
            int randomIndexToSwap = rand.nextInt(clearingArray.length);
            int temp = clearingArray[randomIndexToSwap];
            clearingArray[randomIndexToSwap] = clearingArray[i];
            clearingArray[i] = temp;
        }

        ImageView clearing1 = (ImageView) findViewById(R.id.clearing1);
        ImageView clearing2 = (ImageView) findViewById(R.id.clearing2);
        ImageView clearing3 = (ImageView) findViewById(R.id.clearing3);
        ImageView clearing4 = (ImageView) findViewById(R.id.clearing4);
        ImageView clearing5 = (ImageView) findViewById(R.id.clearing5);
        ImageView clearing6 = (ImageView) findViewById(R.id.clearing6);
        ImageView clearing7 = (ImageView) findViewById(R.id.clearing7);
        ImageView clearing8 = (ImageView) findViewById(R.id.clearing8);
        ImageView clearing9 = (ImageView) findViewById(R.id.clearing9);
        ImageView clearing10 = (ImageView) findViewById(R.id.clearing10);
        ImageView clearing11 = (ImageView) findViewById(R.id.clearing11);
        ImageView clearing12 = (ImageView) findViewById(R.id.clearing12);

        ImageView imgArray[] = { clearing1, clearing2, clearing3, clearing4, clearing5, clearing6, clearing7, clearing8, clearing9, clearing10, clearing11, clearing12 };

        for(int i = 0; i < clearingArray.length; i++) {
            switch(clearingArray[i]) {
                case 1:
                    // Make imageView into a Bunny image
                    imgArray[i].setImageResource(R.drawable.clearing_bunny);
                    break;
                case 2:
                    // Make imageView into a Mouse image
                    imgArray[i].setImageResource(R.drawable.clearing_mouse);
                    break;
                case 3:
                    // Make imageView into a Fox image
                    imgArray[i].setImageResource(R.drawable.clearing_fox);
                    break;
                default:
                    // Do nothing.
                    break;
            }

        }
    }

    public void reset(View view) {
        ImageView clearing1 = (ImageView) findViewById(R.id.clearing1);
        ImageView clearing2 = (ImageView) findViewById(R.id.clearing2);
        ImageView clearing3 = (ImageView) findViewById(R.id.clearing3);
        ImageView clearing4 = (ImageView) findViewById(R.id.clearing4);
        ImageView clearing5 = (ImageView) findViewById(R.id.clearing5);
        ImageView clearing6 = (ImageView) findViewById(R.id.clearing6);
        ImageView clearing7 = (ImageView) findViewById(R.id.clearing7);
        ImageView clearing8 = (ImageView) findViewById(R.id.clearing8);
        ImageView clearing9 = (ImageView) findViewById(R.id.clearing9);
        ImageView clearing10 = (ImageView) findViewById(R.id.clearing10);
        ImageView clearing11 = (ImageView) findViewById(R.id.clearing11);
        ImageView clearing12 = (ImageView) findViewById(R.id.clearing12);

        ImageView imgArray[] = { clearing1, clearing2, clearing3, clearing4, clearing5, clearing6, clearing7, clearing8, clearing9, clearing10, clearing11, clearing12 };

        for(int i = 0; i < imgArray.length; i++) {
            imgArray[i].setImageResource(R.drawable.clearing_blank);
        }
    }
}