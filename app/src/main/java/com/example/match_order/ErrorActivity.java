package com.example.match_order;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ErrorActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_error);

        Intent intent = this.getIntent();
        String error_message = intent.getStringExtra(AbstractActivity.MESSEGE_KEY);
        TextView textView = findViewById(R.id.error);
        textView.setText(error_message);
    }
}
