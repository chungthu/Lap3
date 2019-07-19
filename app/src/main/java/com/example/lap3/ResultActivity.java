package com.example.lap3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView line1;
    private TextView line2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);

        line1.setText(String.valueOf(Common.RESULT));
        line2.setText(String.valueOf(Common.SIZE));
    }

    public void Reset(View view) {
        Common.RESULT = 0;
        startActivity(new Intent(ResultActivity.this,MainActivity.class));
    }
}
