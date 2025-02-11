package com.example.androidlab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidlab.R;

public class incrlab4 extends AppCompatActivity {

    private int count = 0;
    private TextView countText;
    private Button incrementButton;
    private Button decrementButton;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incrlab4);

        // Initialize the views

        countText=findViewById(R.id.countText);
        incrementButton = findViewById(R.id.incrementButton);
        decrementButton = findViewById(R.id.decrementButton);
        resetButton = findViewById(R.id.resetButton);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        countText.setText(str);
        count = Integer.parseInt(str);
        // Increment button functionality
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Intent intent = new Intent(incrlab4.this, com.example.androidlab.incrlab4.class);
                intent.putExtra("message_key", String.valueOf(count));
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"+",Toast.LENGTH_SHORT).show();
            }
        });

        // Decrement button functionality
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                Intent intent = new Intent(incrlab4.this, com.example.androidlab.decrlab4.class);
                intent.putExtra("message_key", String.valueOf(count));
                startActivity(intent);


                Toast.makeText(getApplicationContext(),"-",Toast.LENGTH_SHORT).show();
            }
        });

        // Reset button functionality
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                Intent intent = new Intent(incrlab4.this, com.example.androidlab.lab4.class);
                intent.putExtra("message_key", String.valueOf(count));
                startActivity(intent);
                countText.setText(String.valueOf(count));
                Toast.makeText(getApplicationContext(),"default set",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
