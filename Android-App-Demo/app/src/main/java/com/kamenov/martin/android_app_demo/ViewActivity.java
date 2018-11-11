package com.kamenov.martin.android_app_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    private TextView mHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        mHeader = (TextView)findViewById(R.id.header);
        String header = "Header for id: " + getIntent().getIntExtra("id", 0);
        mHeader.setText(header);
    }
}
