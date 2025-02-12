package com.example.androidlab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class calci extends AppCompatActivity {
int n1=0,n2=0,a=0;
    private Button add;private Button sub;private Button mult;private Button div;
    private EditText num1,num2; private TextView ans;
@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.calci);
    add=findViewById(R.id.add);
    sub=findViewById(R.id.sub);
    div=findViewById(R.id.divide);
    mult=findViewById(R.id.multiply);

    num1 = findViewById(R.id.num1);
    num2=findViewById(R.id.num2);
    ans=findViewById(R.id.ans);

    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n1=Integer.parseInt(num1.getText().toString());
            n2=Integer.parseInt(num2.getText().toString());
            a=n1+n2;
            ans.setText(String.valueOf(a));
        }
    });
    sub.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n1=Integer.parseInt(num1.getText().toString());
            n2=Integer.parseInt(num2.getText().toString());
            a=n1-n2;
            ans.setText(String.valueOf(a));
        }
    });

    mult.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n1=Integer.parseInt(num1.getText().toString());
            n2=Integer.parseInt(num2.getText().toString());
            a=n1*n2;
            ans.setText(String.valueOf(a));
        }
    });
    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            n1=Integer.parseInt(num1.getText().toString());
            n2=Integer.parseInt(num2.getText().toString());
            a=n1/n2;
            ans.setText(String.valueOf(a));
        }
    });



}
}
