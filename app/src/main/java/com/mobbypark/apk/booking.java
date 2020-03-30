package com.mobbypark.apk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static java.lang.StrictMath.abs;

public class booking extends AppCompatActivity {
    String temp, temp2;
    Button b1;
    TextView t1, time, cost;
    String string;
    int TotalTime, tm1, tm2;
    int TotalCost;
    EditText e1, e2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);

        t1 = findViewById(R.id.parkingNameTextView);
        b1 = findViewById(R.id.confirmBookingButtonView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(booking.this, "Booking Confirmed", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(booking.this, receipt.class);
                startActivity(intent);
                // fun();
            }
        });
    }

    private void fun() {
        time = findViewById(R.id.totaltimeDisplayTextView);
        cost = findViewById(R.id.totaltimeTextView);
        e1 = findViewById(R.id.toEditTextView);
        e2 = findViewById(R.id.fromEditTextView);


        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = e1.getText().toString();
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp2 = e2.getText().toString();
            }
        });

        tm1 = Integer.parseInt(temp);
        tm2 = Integer.parseInt(temp2);

        // Do the correct time calculation it is temporary
        TotalTime = abs(tm1 - tm2);
        TotalTime = 20 * TotalTime;
        time.setText(TotalTime);
        cost.setText("₹ " + TotalCost);
    }
}
