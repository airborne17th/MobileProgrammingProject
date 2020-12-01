package com.example.livingrootproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DateFormat;
import java.util.Calendar;

public class ScheduleActivity extends AppCompatActivity {
    private TextView reservation;
    public String resTime;
    public int intPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        final EditText players = (EditText) findViewById(R.id.txtPlayers);
        Button bReserve = (Button) this.<View>findViewById(R.id.btnReserve);
        reservation = (TextView) this.<View>findViewById(R.id.txtReservation);
        Button btDate = (Button) this.<View>findViewById(R.id.btnDate);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        btDate.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(ScheduleActivity.this, d, c.get(Calendar.YEAR),
                        c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        bReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isValid = true;

                if (players.getText().toString() == null) isValid = false;
                if (resTime == null) isValid = false;
                if (isValid) {
                    intPlayers = Integer.parseInt(players.getText().toString());
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putInt("key1", intPlayers);
                    editor.putString("key2", resTime);
                    editor.apply();
                    startActivity(new Intent(ScheduleActivity.this, ConfirmationActivity.class));
                } else {
                    displayToast("Invalid Data!");
                }

            }
        });
            }
        Calendar c = Calendar.getInstance();
        DateFormat fmtDate = DateFormat.getDateInstance();
    final DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, monthOfYear);
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            resTime = fmtDate.format(c.getTime());
            reservation.setText(resTime);
        }
    };
        public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
        }
    public void backHome(View view) {
        Intent intent = new Intent(ScheduleActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

