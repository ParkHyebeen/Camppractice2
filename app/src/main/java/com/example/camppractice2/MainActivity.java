package com.example.camppractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        textview = findViewById(R.id.txtCount);

    }

    public void onToastClick(View view){
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();

    }

    public void onCountClick(View view){
        int count = Integer.parseInt(textview.getText().toString());
        textview.setText((count++)+"");

    }
}