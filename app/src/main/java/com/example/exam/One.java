package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class One extends AppCompatActivity implements View.OnClickListener {

    private TextView welcome;
    private ImageView course,facility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Intent intent = getIntent();
        welcome = findViewById(R.id.tv_welcome);
        welcome.setText(intent.getStringExtra("name"));

        initView();
    }

    private void initView() {
        course = findViewById(R.id.iv_class);
        facility = findViewById(R.id.iv_tool);

        course.setOnClickListener(this);
        facility.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_class:
                Intent intent = new Intent(One.this,Two.class);
                startActivity(intent);
                break;
            case R.id.iv_tool:
                finish();
                break;
        }
    }
}
