package com.xramzzzesx.gazhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicHelp extends AppCompatActivity implements View.OnClickListener {

    Button button_fire, button_cold, button_tok, button_td;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic_help);

        button_fire = (Button) findViewById(R.id.btn_fire);
        button_fire.setOnClickListener(this);
        button_cold = (Button) findViewById(R.id.btn_cold);
        button_cold.setOnClickListener(this);
        button_tok = (Button) findViewById(R.id.btn_tok);
        button_tok.setOnClickListener(this);
        button_td = (Button) findViewById(R.id.btn_td);
        button_td.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btn_fire) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_fire");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_cold) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_cold");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_tok) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_tok");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_td) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_td");
            startActivity(intent);
        }
    }
}