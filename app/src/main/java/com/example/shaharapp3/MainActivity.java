package com.example.shaharapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        count = 0;
    }
    @SuppressLint("SetTextI18n")
    public void go(View view){
        count++;
        if(count == 6)
            btn.setText("Enough to click. Go to new start!");
    }
}