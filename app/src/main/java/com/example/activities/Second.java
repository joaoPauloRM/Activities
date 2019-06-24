package com.example.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        String lg = bundle.getString("login");
        text.setText("Seu login é: " + lg);

    }
}
