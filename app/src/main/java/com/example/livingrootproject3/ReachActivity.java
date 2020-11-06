package com.example.livingrootproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ReachActivity extends AppCompatActivity {
    int totalReach = 0;
    String strTotalReach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reach);
    }

    public void onCheckboxClicked(View view) {

        final TextView txtTotalReach = (TextView) findViewById(R.id.txtTotalReach);
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.box_cat:
                if (checked) {
                    totalReach = totalReach + 10;
                    // txtTotalReach.setText("Potato Chip!");
                } else {
                    totalReach = totalReach - 10;
                    // txtTotalReach.setText("Chips of Potatoes!");
                }
                strTotalReach = Integer.toString(totalReach);
                txtTotalReach.setText(strTotalReach);
                break;
            case R.id.box_duchy:
                if (checked) {
                    totalReach = totalReach + 8;
                } else {
                    totalReach = totalReach - 8;
                }
                strTotalReach = Integer.toString(totalReach);
                txtTotalReach.setText(strTotalReach);
                break;
            case R.id.box_eyrie:
                if (checked) {
                    totalReach = totalReach + 7;
                } else {
                    totalReach = totalReach - 7;
                }
                strTotalReach = Integer.toString(totalReach);
                txtTotalReach.setText(strTotalReach);
                break;
            case R.id.box_vagabond:
            case R.id.box_riverfolk:
                if (checked) {
                    totalReach = totalReach + 5;
                } else {
                    totalReach = totalReach - 5;
                }
                strTotalReach = Integer.toString(totalReach);
                txtTotalReach.setText(strTotalReach);
                break;
            case R.id.box_woodland:
            case R.id.box_corvid:
                if (checked) {
                    totalReach = totalReach + 3;
                } else {
                    totalReach = totalReach - 3;
                }
                strTotalReach = Integer.toString(totalReach);
                txtTotalReach.setText(strTotalReach);
                break;
            case R.id.box_lizards:
            case R.id.box_vagabond2:
                if (checked) {
                    totalReach = totalReach + 2;
                } else {
                    totalReach = totalReach - 2;
                }
                strTotalReach = Integer.toString(totalReach);
                txtTotalReach.setText(strTotalReach);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}