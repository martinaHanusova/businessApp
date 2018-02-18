package com.example.android.businessapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView openingHours = findViewById(R.id.opening);
        openingHours.setText(getOpeningHours());

    }

    /**
     * Method for getting day of the week
     * @return Three first letters from day of the week
     */
    protected String getDay() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        return String.valueOf(date).substring(0, 3);
    }

    /**
     * Method for geting opening hours
     * @return string with time or "closed"
     */

    protected String getOpeningHours() {
        String day = getDay();
        if (day.equals("Sun")) {
            return getString(R.string.closed);
        } else if (day.equals("Sat")){
            return "09:00 – 12:00";
        } else {
            return "09:00 - 18:00";
        }
    }
}
