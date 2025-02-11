package com.example.androidlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidlab.R;

public class Activity2 extends AppCompatActivity {

    private int count = 0;
    private TextView countText;
    private Button incrementButton;
    private Button decrementButton;
    private Button resetButton;
private Button nextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        // Initialize the views
        countText = findViewById(R.id.countText);
        incrementButton = findViewById(R.id.incrementButton);
        decrementButton = findViewById(R.id.decrementButton);
        resetButton = findViewById(R.id.resetButton);
nextButton=findViewById(R.id.nextScreen);
        // Increment button functionality
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countText.setText(String.valueOf(count));
                Toast.makeText(getApplicationContext(),"+",Toast.LENGTH_SHORT).show();
            }
        });

        // Decrement button functionality
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                countText.setText(String.valueOf(count));
                Toast.makeText(getApplicationContext(),"-",Toast.LENGTH_SHORT).show();
            }
        });

        // Reset button functionality
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                countText.setText(String.valueOf(count));
                Toast.makeText(getApplicationContext(),"default set",Toast.LENGTH_SHORT).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Activity2.this, com.example.androidlab.lab4.class);
               startActivity(intent);
               countText.setText(String.valueOf(count));
               Toast.makeText(getApplicationContext(),"next screen!",Toast.LENGTH_SHORT).show();
           }
        });
    }
}
