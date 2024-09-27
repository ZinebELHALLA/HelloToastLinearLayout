package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textViewCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the TextView and Buttons by their ID
        textViewCount = findViewById(R.id.textView_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonIncrement = findViewById(R.id.button_increment);

        // Set up the button listeners programmatically
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCount();
            }
        });
    }

    // Show a Toast message when the first button is clicked
    public void showToast() {
        Toast.makeText(this, "Hello, this is a Toast!", Toast.LENGTH_SHORT).show();
    }

    // Increment the counter when the second button is clicked
    public void incrementCount() {
        count++;
        textViewCount.setText(String.valueOf(count));
    }
}
