package com.example.lap3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sport(View view) {
        Common.TYPE = 1;
        startActivity(new Intent(MainActivity.this,QuizActivity.class));
        finish();
    }

    public void maths(View view) {
        Common.TYPE = 2;
        startActivity(new Intent(MainActivity.this,QuizActivity.class));
        finish();
    }
}
