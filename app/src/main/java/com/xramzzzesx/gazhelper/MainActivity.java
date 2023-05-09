package com.xramzzzesx.gazhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button_what, button_medic, button_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_what = (Button) findViewById(R.id.btn_what);
        button_what.setOnClickListener(this);
        button_medic = (Button) findViewById(R.id.btn_medic);
        button_medic.setOnClickListener(this);
        button_one = (Button) findViewById(R.id.btn_one);
        button_one.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_what) {
            Intent intent = new Intent(this, WhatToDo.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn_medic) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_medic");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_one) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_one");
            startActivity(intent);
        }
    }
}