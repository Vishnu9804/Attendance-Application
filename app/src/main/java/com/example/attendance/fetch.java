package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class fetch extends AppCompatActivity {

    TextView t1,t2;
    String a,b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch);

        t1 = findViewById(R.id.tv1);
        t2 = findViewById(R.id.tv2);

        Bundle bundle = getIntent().getExtras();
        a = bundle.getString("present");
        b = bundle.getString("absent");

        t1.setText(a);
        t2.setText(b);
    }

}