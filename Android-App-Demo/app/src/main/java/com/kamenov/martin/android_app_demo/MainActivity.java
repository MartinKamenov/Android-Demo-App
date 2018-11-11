package com.kamenov.martin.android_app_demo;

import android.content.Intent;
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
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.id = 0;
        mContainer = (LinearLayout)findViewById(R.id.container);
        mAddViewButton = (Button)findViewById(R.id.add_view_btn);
        mAddViewButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        switch (view.getId()) {
            case R.id.add_view_btn:
                addView();
                break;
            default:
                navigateToView(view.getId());
                break;
        }

    }

    private void addView() {
        Button viewButton = new Button(this);
        viewButton.setText("New view " + id);
        viewButton.setId(id++);
        viewButton.setOnClickListener(this);
        mContainer.addView(viewButton);
    }

    private void navigateToView(int id) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}
