package com.xramzzzesx.gazhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhatToDo extends AppCompatActivity implements View.OnClickListener {

    Button button_gkv, button_gp, button_gpod, button_gy, button_gbk, button_gby, button_nogk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_to_do);

        button_gkv = (Button) findViewById(R.id.btn_gkv);
        button_gkv.setOnClickListener(this);
        button_gp = (Button) findViewById(R.id.btn_gp);
        button_gp.setOnClickListener(this);
        button_gpod = (Button) findViewById(R.id.btn_gpod);
        button_gpod.setOnClickListener(this);
        button_gy = (Button) findViewById(R.id.btn_gy);
        button_gy.setOnClickListener(this);
        button_gbk = (Button) findViewById(R.id.btn_gbk);
        button_gbk.setOnClickListener(this);
        button_gby = (Button) findViewById(R.id.btn_gby);
        button_gby.setOnClickListener(this);
        button_nogk = (Button) findViewById(R.id.btn_nogk);
        button_nogk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_gkv) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_gkv");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_gp) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_gp");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_gpod) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_gpod");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_gy) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_gy");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_gbk) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_gbk");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_gby) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_gby");
            startActivity(intent);
        } else if (v.getId() == R.id.btn_nogk) {
            Intent intent = new Intent(this, WhatToDoText.class);
            intent.putExtra("btn", "btn_nogk");
            startActivity(intent);
        }

    }
}