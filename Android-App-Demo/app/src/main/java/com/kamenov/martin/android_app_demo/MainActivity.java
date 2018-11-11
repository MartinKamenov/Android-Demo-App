package com.kamenov.martin.android_app_demo;

import android.graphics.Color;
import android.graphics.PixelFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mAddViewButton;
    private LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContainer = (LinearLayout)findViewById(R.id.container);
        mAddViewButton = (Button)findViewById(R.id.add_view_btn);
        mAddViewButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        TextView textView = new TextView(this);
        textView.setText("New view");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 35);
        mContainer.addView(textView);
    }
}
